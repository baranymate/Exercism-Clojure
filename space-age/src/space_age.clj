(ns space-age)

(defn calc [ratio sec]
  (/ sec (* ratio 31557600)))

(def on-mercury (partial calc 0.2408467))

(def on-venus (partial calc 0.61519726))

(def on-earth (partial calc 1.0))

(def on-mars (partial calc 1.8808158))

(def on-jupiter (partial calc 11.862615))

(def on-saturn (partial calc 29.447498))

(def on-neptune (partial calc 164.79132))

(def on-uranus (partial calc 84.016846))
