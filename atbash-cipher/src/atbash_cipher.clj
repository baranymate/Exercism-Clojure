(ns atbash-cipher
  (:require [clojure.string :as str]))

(def table (zipmap "abcdefghijklmnopqrstuvwxyz0123456789"
                   "zyxwvutsrqponmlkjihgfedcba0123456789"))

(defn encode [plain]
  (->> plain
    str/lower-case
    (map table)
    (filter some?)
    (partition-all 5)
    (map (partial apply str))
    (str/join #" ")))
