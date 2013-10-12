(ns drone.core
  (:use [clj-drone.core]))

(defn l []
  (drone :land))

(defn rise []
  (drone-initialize)
  (drone :emergency)
  (drone :flat-trim)
  (drone :take-off))

(defn simple []
  (rise)
  (Thread/sleep 5000)
  (l))

(defn flip []
  (rise)
  (drone :up 1)
  (Thread/sleep 7000)
  (drone :anim-flip-right)
  (Thread/sleep 7000)
  (l))

(defn roundel []
  (rise)
  (Thread/sleep 5000)
  (drone :target-roundel-v)
  (Thread/sleep 30000)
  (drone :land))
