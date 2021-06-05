(ns strain)

(defn retain [func orig]
  (loop [[hd & tl] orig res []]
    (cond
      (nil? hd) res
      (func hd) (recur tl (conj res hd))
      :else (recur tl res))))

(defn discard [func coll]
  (retain (complement func) coll))
