(ns isbn-verifier
  (:require [clojure.string :as str]))

(defn valid-format? [isbn]
  (some? (re-matches #"\d{9}[\dX]" isbn)))

(defn digitalize[digit]
  (if (= digit \X)
    10
    (Character/digit digit 10)))

(defn calculate [hyphenless]
  (let [coeffs (range 10 0 -1)]
  (->> hyphenless
    (map digitalize)
    (map * coeffs)
    (apply +))))

(defn isbn? [isbn]
  (let [hyphenless (str/replace isbn #"-" "")]
    (and (valid-format? hyphenless)
         (zero? (mod (calculate hyphenless) 11)))))
