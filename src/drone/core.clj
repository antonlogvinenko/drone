(ns drone.core
  (:use [clj-drone.core]))

(defn l [] (drone :land))

(defn rise []
  (drone-initialize)
  (drone :emergency)
  (drone :flat-trim)
  (drone :take-off))

(defn sleep [n] (-> n (* 1000) Thread/sleep))

(defn simple []
  (rise)
  (sleep 5)
  (l))

(defn flip []
  (rise)
  (sleep 7)
  (drone :anim-flip-right)
  (sleep 7)
  (l))

(defn roundel []
  (rise)
  (sleep 5)
  (drone :target-roundel-v)
  (sleep 15)
  (drone :land))
