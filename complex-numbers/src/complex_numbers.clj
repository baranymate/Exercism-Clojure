(ns complex-numbers)

(def real first)

(def imaginary second)

(defn abs [[a b]]
  (Math/sqrt (+ (* a a) (* b b))))

(defn conjugate [[a b]]
  [a (- b)])

(defn add [[a b] [c d]]
  [(+ a c) (+ b d)])

(defn sub [[a b] [c d]]
  [(- a c) (- b d)])

(defn mul [[a b] [c d]]
  [(- (* a c) (* b d)) (+ (* b c) (* a d))])

(defn div [[a b] [c d]]
  (let [divisor (float (+ (* c c) (* d d)))
        real (/ (+ (* a c) (* b d)) divisor)
        im (/ (- (* b c) (* a d)) divisor)]
        [real im]))
