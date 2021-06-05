(ns raindrops
  (:require [clojure.string :as str]))

(defn pling-plang-plong [num]
  (let [test? #(zero? (mod num %))]
    (cond-> nil
      (test? 3) (str "Pling")
      (test? 5) (str "Plang")
      (test? 7) (str "Plong"))))


(defn convert [num]
  (let [temp (pling-plang-plong num)]
    (if (str/blank? temp)
      (str num)
      temp)))
