(ns perfect-numbers)

(defn aliquot[num]
  (->> (range 1 (+ (/ num 2) 1))
    (filter #(zero?(mod num %)))
    (apply +)))

(defn classify [num]
  (when (< num 1) (throw (IllegalArgumentException. "Illegal argument")) )
  (let [asum (aliquot num)]
    (cond
      (> asum num) :abundant
      (= asum num) :perfect
      :else :deficient)))
