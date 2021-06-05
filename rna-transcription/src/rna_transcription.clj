(ns rna-transcription)

(def nucleotides {\G \C,
                  \C \G,
                  \T \A,
                  \A \U})

(defn transform [nucleotide]
  (nucleotides nucleotide))

(defn to-rna [dna]
  (let [transformed (apply str (map transform dna))]
    (assert (= (count dna) (count transformed)))
    transformed))
