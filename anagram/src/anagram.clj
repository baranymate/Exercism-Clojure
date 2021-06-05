(ns anagram
  (:require [clojure.string :as str]))

(defn anagram? [w1 sw1 w2]
  (let [lw2 (str/lower-case w2)]
        (and (= sw1 (sort lw2))
             (not= w1 w2))))

(defn anagrams-for [word prospect-list]
  (let [lw (str/lower-case word)
        slw (sort lw)]
  (->> prospect-list
    (filter (partial anagram? lw slw)))))
