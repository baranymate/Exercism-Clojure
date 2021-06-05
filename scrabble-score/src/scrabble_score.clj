(ns scrabble-score
  (:require [clojure.string :as str]))

(defn create-map-from-pair [[fst snd]]
  (let [size (count fst)
        keys (str/split fst #"")
        vals (repeat size snd)]
    (zipmap keys vals)))

(defn inverter [orig]
  (apply merge (map create-map-from-pair orig)))

(def orig-map {"AEIOULNRST" 1,
               "DG" 2,
               "BCMP" 3,
               "FHVWY" 4,
               "K" 5,
               "JX" 8,
               "QZ" 10})

(def inverted-map (inverter orig-map))

(defn score-letter [letter]
  (inverted-map (str/upper-case letter)))

(defn score-word [word]
  (let [letters (str/split word #"")]
    (apply + (map score-letter letters))))
