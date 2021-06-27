(ns binary-search)

(defn temp [needle haystack l r]
  (let [mid (int (+ l (/ (- r l) 2)))
        mid-value (nth haystack mid nil)]
        (assert (>= r l) "not found")
        (cond
          (= needle mid-value) mid
          (>= mid-value needle) (recur needle haystack l (dec mid))
          :else (recur needle haystack (inc mid) r))))

(defn search-for [needle haystack]
  (temp needle haystack 0 (dec (count haystack))))

(defn middle [haystack]
  (quot (count haystack) 2))
