(ns mulerator.optimizer-test (:require [clojure.test :refer :all] [mulerator.optimizer :refer [total-value combo-weight powerset]]))

(deftest total-value-returns-total
  (def somevar [{:doll-value 1} {:doll-value 2} {:doll-value 3}])
  (is (= 6 (total-value somevar)))
  )