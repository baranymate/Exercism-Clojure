(ns armstrong-numbers)

(defn digitalize [num]
  (->> num
   (iterate #(quot % 10))
   (take-while pos?)
   (map #(mod % 10))))

(defn pow [exp base]
  (apply * (repeat exp base)))

(defn armstrong? [num]
  (let [digits (digitalize num)
        exponent (count digits)]
    (->> digits
         (map (partial pow exponent))
         (apply +)
         (= num))))
