(ns trinary)

(defn convert [col]
  (->> col
      (map #(Character/digit % 3))
      reverse
      (map * (iterate (partial * 3) 1))
      (apply +)))

(defn valid? [x]
  (or (= x \0) (= x \1) (= x \2)))

(defn to-decimal [string]
  (if (every? valid? string)
   (convert string)
   0))
