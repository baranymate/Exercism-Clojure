(ns grade-school)

(defn grade [school grd]
  (get school grd []))

(defn add [school name grd]
  (let [temp (grade school grd)]
      (assoc school grd (conj temp name))))

(defn sort-by-vals [m]
  (zipmap (keys m) (map sort (vals m))))

(defn sort-by-keys [m]
  (into (sorted-map) m))

(defn sorted [school]
  (->> school
    sort-by-keys
    sort-by-vals))
