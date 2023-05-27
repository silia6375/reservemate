#!/usr/bin/python
# -*- coding:utf-8 -*-

''' Script for Class QRSticker '''

# Libraries
import qrcode

# Class for QR-Stickers
class QRSticker:

  # Constructor
  def __init__(self, code, payment, menu):
    self.code = code
    self.payment = payment
    self.capacity = menu

  # Reading QR and displaying data to user depending input
  def ReadQR(self, camera_input, code_input):

    # Taking scan for input
    if camera_input is not None:
      print(f'\nPayment: {self.payment}\nMenu: {self.Menu}\nCode: {self.code}')

    # Taking code for input
    elif camera_input is None:

      # Connecting with database
      dbname = get_database()
      # Choosing collection
      col = dbname["QRStickers"]

      for q in col.find():

        if q['code'] == code_input:
          self.payment = q['payment']
          self.menu = q['menu']
          self.code = q['code']

    # No input
    else:
      print('QR sticker is damaged!')

# Connection with database
def get_database():
    # Provide the mongodb atlas url to connect python to mongodb using pymongo
    CONNECTION_STRING = "mongodb+srv://****:************@cluster0.jnvsh.mongodb.net/Reservemate"

    # Create a connection using MongoClient
    from pymongo import MongoClient
    client = MongoClient(CONNECTION_STRING)

    # Create the database
    return client["StudentUp"]