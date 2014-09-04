(ns mulerator.dealer (:gen-class))

(defn user-input-str [call]
  (println ("%s:" call))
  (read-line))

(defn to_i [string]
  (Integer. (re-find #"\d+" string)))

(defn user-input-int [call]
  (println (format "%s:" call))
  to_i(read-line))

(defn max-mule-load []
  (user-input-int "What is the max weight the mule can carry today?"))

(defn dealer-dolls [])
  ; (loop [x 0]
  ;   (while (x == 1)
  ;     (user-input-int ""))))