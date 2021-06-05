(ns hexadecimal)

(defn convert [col]
  (->> col
      (map #(Character/digit % 16))
      reverse
      (map * (iterate (partial * 16) 1))
      (apply +)))

(defn invalid? [x]
  (re-find #"[^0-9a-f]" x))

(defn hex-to-int [string]
  (if (invalid? string)
    0
    (convert string)))
