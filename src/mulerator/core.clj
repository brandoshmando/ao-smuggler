(ns mulerator.core (:require [mulerator.dealer :refer [packed-dolls]] [mulerator.optimizer]) (:gen-class))

(defn to_i [string]
  (Integer. (re-find #"\d+" string)))

(defn user-input-int [call]
  (println (format "%s:" call))
  to_i(read-line))

(defn -main []
  (let [max-score (user-input-int "What is the Mule's weight limit today?")
        dealer-dolls ()]
    (println max-score)))
