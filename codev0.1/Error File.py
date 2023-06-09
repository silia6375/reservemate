#!/usr/bin/python
# -*- coding:utf-8 -*-

''' Script for Class ErrorFile '''

# Class for ErrorFiles
class ErrorFile:

  # Constructor
  def create_error_info(self, id, code, text):
    self.id = id
    self.code = code
    self.text = text

  def get_error_info(self, camera):

    error_file = None

    if camera is None:
      self.code = 0

      error_file = {
        "id": self.id,
        "code": self.code,
        "text": self.text
      }

    return error_file
