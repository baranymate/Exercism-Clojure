(ns triangle)

(defn all-sides-positive? [a b c]
  (every? pos? [a b c]))

(defn constructible? [a b c]
  (and (>= (+ a b) c)
       (>= (+ a c) b)
       (>= (+ b c) a)))

(defn is-valid? [a b c]
  (and (all-sides-positive? a b c)
       (constructible? a b c)))

(defn equilateral? [a b c]
  (and (is-valid? a b c) (= a b c)))

(defn isosceles? [a b c]
  (and (is-valid? a b c)
    (or (= a b) (= a c) (= b c))))

(defn scalene? [a b c]
  (and (is-valid? a b c) (not= a b) (not= b c) (not= a c)))
