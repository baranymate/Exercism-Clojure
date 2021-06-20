(ns sieve
  (:require [clojure.set :as set]))

(defn helper [num limit]
  (range (* 2 num) (inc limit) num))

(defn sieving-numbers [i limit n sieving-numbers]
  (if (> i limit)
    sieving-numbers
    (let [temp (set (helper i n))]
      (recur (inc i) limit n (set/union sieving-numbers temp)))))

(defn all-numbers [n]
  (set (range 2 (inc n))))

(defn sieve [n]
  (let [all (all-numbers n)
        sieving (sieving-numbers 2 (int (Math/sqrt n)) n #{})]
        (sort (vec (set/difference all sieving)))))
