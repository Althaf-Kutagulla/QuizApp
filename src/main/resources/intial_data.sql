
INSERT INTO quiz_users (username) VALUES
                                      ('JohnDoe'),
                                      ('JaneSmith'),
                                      ('AliceJones'),
                                      ('BobBrown'),
                                      ('CharlieWhite');

-- questions


INSERT INTO questions (question, answer) VALUES
                                             ('What is the capital of France?', 'Paris'),
                                             ('What is 5 + 3?', '8'),
                                             ('What is the color of the sky on a clear day?', 'Blue'),
                                             ('Who wrote "Romeo and Juliet"?', 'William Shakespeare'),
                                             ('What is the boiling point of water in degrees Celsius?', '100'),
                                             ('What is the largest planet in our solar system?', 'Jupiter'),
                                             ('What is the square root of 64?', '8'),
                                             ('Who painted the Mona Lisa?', 'Leonardo da Vinci'),
                                             ('What is the chemical symbol for water?', 'H2O'),
                                             ('What is the primary language spoken in Spain?', 'Spanish');


-- choices

INSERT INTO choices (question_id, choice) VALUES
                                              (1, 'Paris'),
                                              (1, 'London'),
                                              (1, 'Berlin'),
                                              (1, 'Rome'),
                                              (2, '6'),
                                              (2, '8'),
                                              (2, '10'),
                                              (2, '7'),
                                              (3, 'Blue'),
                                              (3, 'Green'),
                                              (3, 'Red'),
                                              (3, 'Yellow'),
                                              (4, 'Charles Dickens'),
                                              (4, 'William Shakespeare'),
                                              (4, 'Mark Twain'),
                                              (4, 'Leo Tolstoy'),
                                              (5, '90'),
                                              (5, '100'),
                                              (5, '120'),
                                              (5, '80'),
                                              (6, 'Mars'),
                                              (6, 'Earth'),
                                              (6, 'Jupiter'),
                                              (6, 'Venus'),
                                              (7, '6'),
                                              (7, '7'),
                                              (7, '8'),
                                              (7, '9'),
                                              (8, 'Vincent van Gogh'),
                                              (8, 'Pablo Picasso'),
                                              (8, 'Leonardo da Vinci'),
                                              (8, 'Claude Monet'),
                                              (9, 'O2'),
                                              (9, 'CO2'),
                                              (9, 'H2O'),
                                              (9, 'H2SO4'),
                                              (10, 'French'),
                                              (10, 'German'),
                                              (10, 'Spanish'),
                                              (10, 'Italian');