(ns binary)

(defn convert [col]
  (->> col
      (map #(Character/digit % 2))
      reverse
      (map * (iterate (partial * 2) 1))
      (apply +)))

(defn valid? [x]
  (or (= x \0) (= x \1)))

(defn to-decimal [string]
  (if (every? valid? string)
   (convert string)
   0))
