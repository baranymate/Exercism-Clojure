(ns rotational-cipher)

(defn translate-char [c r o]
  (-> c
    int
    (- o)
    (+ r)
    (mod 26)
    (+ o)
    char))

(defn translate [r c]
  (cond-> c
    (Character/isLowerCase c) (translate-char r 97)
    (Character/isUpperCase c) (translate-char r 65)))

(defn rotate [plain rot]
  (->> plain
    (map (partial translate rot))
    (apply str)))
