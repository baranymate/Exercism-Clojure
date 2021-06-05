(ns accumulate)

(defn accumulate
  ([func coll] (accumulate func coll []))
  ([func coll res]
    (if (empty? coll)
      res
      (recur func (rest coll) (conj res (func (first coll)))))))
