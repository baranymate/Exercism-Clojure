(ns sublist)

(defn superset? [list1 list2]
  (let [chunksize (count list2)]
    (->> list1
      (partition chunksize 1)
      (some (partial = list2)))))

(defn classify [list1 list2]
  (let [l1 (count list1)
        l2 (count list2)]
    (cond
      (and (> l1 l2) (superset? list1 list2)) :superlist
      (and (< l1 l2) (superset? list2 list1)) :sublist
      (= list1 list2) :equal
      :else :unequal)))
