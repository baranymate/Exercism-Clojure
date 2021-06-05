(ns octal)

(defn convert [col]
  (->> col
      (map #(Character/digit % 8))
      reverse
      (map * (iterate (partial * 8) 1))
      (apply +)))

(defn invalid? [x]
  (re-find #"[^0-7]" x))

(defn to-decimal [string]
  (if (invalid? string)
   0
   (convert string)))
