(ns drone.core
  (:use [clj-drone.core]))

(defn foo []
  (drone-initialize :default "192.168.1.1" 5556)
  (drone :take-off)
  (Thread/sleep 4000)
  (drone :land))
