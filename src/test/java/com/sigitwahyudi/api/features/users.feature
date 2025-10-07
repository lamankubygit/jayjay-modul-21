@api
Feature: Pengujian API DummyAPI.io - Endpoint Users

  @positive
  Scenario: Mendapatkan daftar user (limit 5)
    When sistem mengirim request GET users dengan limit 5
    Then status code yang diterima adalah 200
    And jumlah data user pada response adalah 5
    And setiap data memiliki ID yang valid

  @positive
  Scenario: Mendapatkan detail user berdasarkan ID valid
    When sistem mengirim request GET user dengan ID "60d0fe4f5311236168a109d4"
    Then status code yang diterima adalah 200
    And response berisi ID yang sama "60d0fe4f5311236168a109d4"

  @negative
  Scenario: Mendapatkan detail user dengan ID tidak valid
    When sistem mengirim request GET user dengan ID "ngasaltest12345678910"
    Then status code yang diterima adalah 400 atau 404
    And response body berisi pesan error "PARAMS_NOT_VALID"
