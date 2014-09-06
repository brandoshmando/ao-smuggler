(ns mulerator.dealer-test
  (:require [clojure.test :refer :all]
            [mulerator.dealer :refer [spacer]]))

; Test for spacer somewhat pointless since it returns nil but does check to see tht identical function returns the same
(deftest test-spacer-is-line
  (defn result []
    (println "---------------"))
  (is (= (result) (spacer )))
  )

