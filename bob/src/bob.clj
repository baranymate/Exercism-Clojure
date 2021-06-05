(ns bob
  (:require [clojure.string :as str]))

(defn response-for [s]
  (let [question (str/ends-with? (str/trimr s) "?")
        blank    (str/blank? s)
        yell     (and (some #(Character/isUpperCase %) s)
                      (not-any? #(Character/isLowerCase %) s))]
    (cond
      (and question yell) "Calm down, I know what I'm doing!"
      yell "Whoa, chill out!"
      question "Sure."
      blank "Fine. Be that way!"
      :else "Whatever.")))
