(ns pangram
  (:require [clojure.string :as str]))

(defn pangram? [sentence]
  (->> sentence
       str/upper-case
       (filter #(Character/isLetter %))
       frequencies
       count
       (= 26)))
