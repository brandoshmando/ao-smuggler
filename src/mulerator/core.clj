(ns mulerator.core (:require [mulerator.dealer] [mulerator.optimizer]) (:gen-class))

(defn to_i [string]
  (Integer. (re-find #"\d+" string)))

(defn user-input [call]
  (println (format "%s:" call))
  to_i(read-line))

(defn -main []
  (let [max-score (user-input "What is the Mule's weight limit today?")]
    (println max-score)))
