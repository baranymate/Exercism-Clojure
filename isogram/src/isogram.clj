(ns isogram
  (:require [clojure.string :as str]))

(defn isogram? [word]
  (let [lower (str/lower-case word)
        chars (filter #(Character/isLetter %) lower)
        uniquechars (set chars)]
    (= (count chars) (count uniquechars))))
