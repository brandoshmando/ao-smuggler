(ns mulerator.dealer (:gen-class))

(defn spacer []
  (println "---------------"))

(defn to_i [string]
  (Integer. (re-find #"\d+" string)))

(defn user-input-int [call]
  (spacer )
  (println (format "%s:" call))
  to_i(read-line))

(defn max-mule-load []
  (user-input-int "What is the max weight the mule can carry today?"))

(defn dealer-dolls []
  (vec
    (loop [x 0]
      (when (== x 0)
        (spacer )
        (println "Doll name?:")
        (hash-map
          :dollname (read-line)
          :dollvalue (user-input-int "Doll Value")
          :dollweight (user-input-int "Doll Weight"))
        (println "Any more dolls? (Yes/No)")
        ; (def prompt-answer (read-line))
        ; (if (= (clojure.string/lower-case prompt-answer) "no") (inc x) (recur(+ x 0)))
        ))))
