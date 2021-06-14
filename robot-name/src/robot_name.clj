(ns robot-name)

(def letters "ABCDEFGHIJKLMNOPQRSTUXYVWZ")

(defn helper[lb ub]
  (+ lb (rand-int (- ub lb))))

(defn generate-num []
  (helper 100 999))

(defn generate-letter[]
  (nth letters (helper 0 26)))

(defn generate-name[]
  (str (generate-letter) (generate-letter) (generate-num)))

(defn robot []
  (atom (generate-name)))

(defn robot-name [robot]
  @robot)

(defn reset-name [robot]
  (reset! robot (generate-name)))
