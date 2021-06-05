(ns grains)

(defn square [x]
  (.shiftLeft (biginteger 1) (dec x)))

(defn total []
  ; power of two series
  (dec (square 65)))
