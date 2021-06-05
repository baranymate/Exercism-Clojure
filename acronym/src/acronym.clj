(ns acronym
  (:require [clojure.string :as str]))

(defn all-upper? [phrase]
  (every? #(Character/isUpperCase %) phrase))

(defn starts-upper? [start]
  (Character/isUpperCase start))

(defn helper [[fst & rest :as phrase]]
  (cond
    (all-upper? phrase) fst
    (starts-upper? fst) (re-seq #"[A-Z]" phrase)
    :else fst))

(defn acronym [phrase]
  (->> (str/split phrase #"\W+")
    (map helper)
    flatten
    (apply str)
    str/upper-case))
