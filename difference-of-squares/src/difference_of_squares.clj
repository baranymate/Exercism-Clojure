(ns difference-of-squares)

(defn temp1 [n]
  (* n (+ 1 n)))

(defn temp2 [n]
  (+ (* 2 n) 1))

(defn sum-of-squares [n]
  (/ (* (temp1 n) (temp2 n)) 6))

(defn sum [n]
  (/ (temp1 n) 2))

(defn square-of-sum [n]
  (* (sum n) (sum n)))

(defn difference [n]
  (- (square-of-sum n) (sum-of-squares n)))
