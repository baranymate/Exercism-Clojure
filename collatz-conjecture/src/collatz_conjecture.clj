(ns collatz-conjecture)

(defn coll [num]
  (if (zero? (mod num 2))
      (/ num 2)
      (+ (* 3 num) 1)))

(defn not-one? [num]
      (not= num 1))

(defn collatz [num]
    (assert (> num 0))
    (count (take-while not-one? (iterate coll num))))
