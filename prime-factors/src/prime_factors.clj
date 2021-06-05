(ns prime-factors)

(defn of
  ([n] (of n 2 []))
  ([num div factors]
    (cond
      (= num 1) factors
      (zero? (mod num div)) (recur (/ num div) div (conj factors div))
      (= div 2) (recur num 3 factors)
      :else (recur num (+ div 2) factors))))
