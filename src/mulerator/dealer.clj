(ns mulerator.dealer (:gen-class))

(defn to_i [string]
  (Integer. (re-find #"\d+" string)))

(defn user-input-int [call]
  (println (format "%s:" call))
  to_i(read-line))

(defn max-mule-load []
  (user-input-int "What is the max weight the mule can carry today?"))

(defn dealer-dolls []
  (loop [x 0]
    (when (== x 0)
      (println "Doll name?:")
      (def doll-name (read-line))
      (def doll-value (user-input-int "Doll Value"))
      (def doll-weight (user-input-int "Doll Weight"))
      (println "Any more dolls? (Yes/No)")
      (def prompt-answer (read-line))
      (if (= (clojure.string/lower-case prompt-answer) "no") (inc x) (recur(+ x 0))))))
