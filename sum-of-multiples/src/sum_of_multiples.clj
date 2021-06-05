(ns sum-of-multiples)

(defn sum-of-multiples [factors limit]
  (->> factors
    (map #(range % limit %))
    flatten
    set
    (apply +)))
