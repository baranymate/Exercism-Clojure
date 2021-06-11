(ns kindergarten-garden
  (:require [clojure.string :as str]))

(def roster ["Alice" "Bob" "Charlie" "David"
             "Eve" "Fred" "Ginny" "Harriet"
             "Ileana" "Joseph" "Kincaid" "Larry"])

(def table {\G :grass \C :clover \V :violets \R :radishes})

(defn flowerize [flower]
  (map table flower))

(defn vectorize [item]
  (map vec item))

(defn keywordize [names]
  (->> (sort names)
    (map str/lower-case)
    (map keyword)))

(defn garden
  ([flowers] (garden flowers roster))
  ([flowers students]
    (->> flowers
      str/split-lines
      (map flowerize)
      (map (partial partition 2))
      (map vectorize)
      (map (partial zipmap (keywordize students)))
      (apply (partial merge-with into)))))
