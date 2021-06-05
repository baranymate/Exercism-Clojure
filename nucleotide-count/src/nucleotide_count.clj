(ns nucleotide-count)

(def nucleotides {\A 0, \C 0, \G 0, \T 0})

(defn count-of-nucleotide-in-strand [nucleotide strand]
  (assert (nucleotides nucleotide))
  (count (filter (partial = nucleotide) strand)))

(defn nucleotide-counts [strand]
  (merge nucleotides (frequencies strand)))
