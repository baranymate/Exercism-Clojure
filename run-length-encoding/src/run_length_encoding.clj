(ns run-length-encoding
  (:require [clojure.string :as str]))

(defn encode-helper [[f & r]]
  (cond->> f
    (seq r) (str (inc (count r)))))

(defn run-length-encode
  "encodes a string with run-length-encoding"
  [plain-text]
  (->> plain-text
    (partition-by identity)
    (map encode-helper)
    (apply str)))

(defn transformer[[all digits char]]
  (cond->> char
    (seq digits) (repeat (Integer. digits))))

(defn run-length-decode
  "decodes a run-length-encoded string"
  [cipher-text]
  (->> cipher-text
    (re-seq #"(\d+)?(\D)")
    (mapcat transformer)
    (apply str)))
