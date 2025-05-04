package traproom.szachy;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import java.util.HashMap;
import java.util.List;

public class HelloController
{
    private ImageView selectedFigure = null;
    Gra gra = HelloApplication.gra;

    List<Ruch> mozliweRuchy = null;

    class Position
    {
        int x;
        int y;
        Position(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    }
    HashMap<ImageView, Position> positions = new HashMap<>();


    @FXML private GridPane szachownica = new GridPane();

    @FXML private ImageView pane00 = new ImageView();
    @FXML private ImageView pane01= new ImageView();
    @FXML private ImageView pane02= new ImageView();
    @FXML private ImageView pane03= new ImageView();
    @FXML private ImageView pane04= new ImageView();
    @FXML private ImageView pane05= new ImageView();
    @FXML private ImageView pane06= new ImageView();
    @FXML private ImageView pane07= new ImageView();
    @FXML private ImageView pane10= new ImageView();
    @FXML private ImageView pane11= new ImageView();
    @FXML private ImageView pane12= new ImageView();
    @FXML private ImageView pane13= new ImageView();
    @FXML private ImageView pane14= new ImageView();
    @FXML private ImageView pane15= new ImageView();
    @FXML private ImageView pane16= new ImageView();
    @FXML private ImageView pane17= new ImageView();
    @FXML private ImageView pane20= new ImageView();
    @FXML private ImageView pane21= new ImageView();
    @FXML private ImageView pane22= new ImageView();
    @FXML private ImageView pane23= new ImageView();
    @FXML private ImageView pane24= new ImageView();
    @FXML private ImageView pane25= new ImageView();
    @FXML private ImageView pane26= new ImageView();
    @FXML private ImageView pane27= new ImageView();
    @FXML private ImageView pane30= new ImageView();
    @FXML private ImageView pane31= new ImageView();
    @FXML private ImageView pane32= new ImageView();
    @FXML private ImageView pane33= new ImageView();
    @FXML private ImageView pane34= new ImageView();
    @FXML private ImageView pane35= new ImageView();
    @FXML private ImageView pane36= new ImageView();
    @FXML private ImageView pane37= new ImageView();
    @FXML private ImageView pane40= new ImageView();
    @FXML private ImageView pane41= new ImageView();
    @FXML private ImageView pane42= new ImageView();
    @FXML private ImageView pane43= new ImageView();
    @FXML private ImageView pane44= new ImageView();
    @FXML private ImageView pane45= new ImageView();
    @FXML private ImageView pane46= new ImageView();
    @FXML private ImageView pane47= new ImageView();
    @FXML private ImageView pane50= new ImageView();
    @FXML private ImageView pane51= new ImageView();
    @FXML private ImageView pane52= new ImageView();
    @FXML private ImageView pane53= new ImageView();
    @FXML private ImageView pane54= new ImageView();
    @FXML private ImageView pane55= new ImageView();
    @FXML private ImageView pane56= new ImageView();
    @FXML private ImageView pane57= new ImageView();
    @FXML private ImageView pane60= new ImageView();
    @FXML private ImageView pane61= new ImageView();
    @FXML private ImageView pane62= new ImageView();
    @FXML private ImageView pane63= new ImageView();
    @FXML private ImageView pane64= new ImageView();
    @FXML private ImageView pane65= new ImageView();
    @FXML private ImageView pane66= new ImageView();
    @FXML private ImageView pane67= new ImageView();
    @FXML private ImageView pane70= new ImageView();
    @FXML private ImageView pane71= new ImageView();
    @FXML private ImageView pane72= new ImageView();
    @FXML private ImageView pane73= new ImageView();
    @FXML private ImageView pane74= new ImageView();
    @FXML private ImageView pane75= new ImageView();
    @FXML private ImageView pane76= new ImageView();
    @FXML private ImageView pane77= new ImageView();

    @FXML
    public void initialize()
    {
        for (Node node : szachownica.getChildren())
            if (node instanceof Pane)
            {
                ImageView imageView = (ImageView) ((Pane) node).getChildren().getFirst();
                addFigureClickHandler(imageView);
                imageView.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/blank.png")));

            }

        pane47.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/white_king.png")));
        pane37.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/white_queen.png")));
        pane07.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/white_rook.png")));
        pane77.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/white_rook.png")));
        pane27.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/white_bishop.png")));
        pane57.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/white_bishop.png")));
        pane17.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/white_knight.png")));
        pane67.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/white_knight.png")));
        pane06.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/white_pawn.png")));
        pane16.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/white_pawn.png")));
        pane26.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/white_pawn.png")));
        pane36.setImage(new Image( getClass().getResourceAsStream("/traproom/szachy/images/white_pawn.png")));
        pane46.setImage(new Image( getClass().getResourceAsStream("/traproom/szachy/images/white_pawn.png")));
        pane56.setImage(new Image( getClass().getResourceAsStream("/traproom/szachy/images/white_pawn.png")));
        pane66.setImage(new Image( getClass().getResourceAsStream("/traproom/szachy/images/white_pawn.png")));
        pane76.setImage(new Image( getClass().getResourceAsStream("/traproom/szachy/images/white_pawn.png")));

        pane40.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/black_king.png")));
        pane30.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/black_queen.png")));
        pane00.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/black_rook.png")));
        pane70.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/black_rook.png")));
        pane20.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/black_bishop.png")));
        pane50.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/black_bishop.png")));
        pane10.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/black_knight.png")));
        pane60.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/black_knight.png")));
        pane01.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/black_pawn.png")));
        pane11.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/black_pawn.png")));
        pane21.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/black_pawn.png")));
        pane31.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/black_pawn.png")));
        pane41.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/black_pawn.png")));
        pane51.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/black_pawn.png")));
        pane61.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/black_pawn.png")));
        pane71.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/black_pawn.png")));


        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
            {
                Pane pane = szachownica.getChildren().get(i * 8 + j) instanceof Pane ? (Pane) szachownica.getChildren().get(i * 8 + j) : null;
                ImageView imageView = (ImageView) pane.getChildren().getFirst();
                positions.put(imageView, new Position(j, i));
            }
    }

    private void clearHighlights(Position oldPosition)
    {
        // Clear possible move highlights
        if (mozliweRuchy != null)
        {
            for (Ruch ruch : mozliweRuchy)
            {
                int x = ruch.toX;
                int y = ruch.toY;
                Pane pane = szachownica.getChildren().get(y * 8 + x) instanceof Pane ? (Pane) szachownica.getChildren().get(y * 8 + x) : null;
                if (pane != null)
                {
                    if ((x + y) % 2 == 0)
                        pane.setStyle("-fx-background-color: white");
                    else
                        pane.setStyle("-fx-background-color: black");
                }
            }
        }
        // Clear rook and king highlights
        Pane rookPane1 = szachownica.getChildren().get(oldPosition.y * 8 + 7) instanceof Pane ? (Pane) szachownica.getChildren().get(oldPosition.y * 8 + 7) : null;
        Pane rookPane2 = szachownica.getChildren().get(oldPosition.y * 8 + 0) instanceof Pane ? (Pane) szachownica.getChildren().get(oldPosition.y * 8 + 0) : null;
        Pane kingPane = szachownica.getChildren().get(oldPosition.y * 8 + 4) instanceof Pane ? (Pane) szachownica.getChildren().get(oldPosition.y * 8 + 4) : null;
        if (rookPane1 != null)
        {
            if ((7 + oldPosition.y) % 2 == 0)
                rookPane1.setStyle("-fx-background-color: white");
            else
                rookPane1.setStyle("-fx-background-color: black");
        }
        if (rookPane2 != null)
        {
            if ((0 + oldPosition.y) % 2 == 0)
                rookPane2.setStyle("-fx-background-color: white");
            else
                rookPane2.setStyle("-fx-background-color: black");
        }
        if (kingPane != null)
        {
            if ((4 + oldPosition.y) % 2 == 0)
                kingPane.setStyle("-fx-background-color: white");
            else
                kingPane.setStyle("-fx-background-color: black");
        }
    }

    // Obsługa kliknięć na przyciski planszy
    private void addFigureClickHandler(ImageView imageView)
    {
        imageView.setOnMouseClicked(event ->
        {
            Figury wybranaFigura = null;
                if (selectedFigure == null) // wybieranie figury ktora bedziemy sie ruszac
                {
                    Position currPosition = positions.get(imageView);
                    Figury figura = gra.szachownica.pola[currPosition.x][currPosition.y].figura;
                    if(figura == null || figura.bialy != gra.aktualnyGracz.bialy)
                        return;

                    if(figura instanceof Pionek)
                        wybranaFigura = (Pionek) figura;
                    else if (figura instanceof Wieza)
                        wybranaFigura = (Wieza) figura;
                    else if(figura instanceof Skoczek)
                        wybranaFigura= (Skoczek) figura;
                    else if (figura instanceof Goniec)
                        wybranaFigura = (Goniec) figura;
                    else if(figura instanceof Hetman)
                        wybranaFigura = (Hetman) figura;
                    else if (figura instanceof Krol)
                        wybranaFigura = (Krol) figura;

                    selectedFigure = imageView;
                    mozliweRuchy = wybranaFigura.mozliwe_pozycje(gra.szachownica);
                    if(mozliweRuchy.isEmpty()) // brak mozliwosci wybania figury ktora nie moze sie ruszyc
                    {
                        selectedFigure = null;
                        return;
                    }
                    //podświetlenie mozliwych ruchow
                    for (Ruch ruch : mozliweRuchy)
                    {
                        int x = ruch.toX;
                        int y = ruch.toY;

                        Pane pane = szachownica.getChildren().get(y * 8 + x) instanceof Pane ? (Pane) szachownica.getChildren().get(y * 8 + x) : null;
                        pane.setStyle("-fx-background-color: green");

                        if(gra.szachownica.pola[x][y].zajetePrzezWroga(wybranaFigura.bialy))
                            pane.setStyle("-fx-background-color: red");
                    }

                    // Highlight rook for castling if king is selected
                    if (wybranaFigura instanceof Krol && !((Krol)wybranaFigura).isMoved())
                    {
                        // Kingside castling
                        if (gra.szachownica.wZakresie(7, currPosition.y))
                        {
                            Pole rookPole = gra.szachownica.pola[7][currPosition.y];
                            if (rookPole.zajete() && rookPole.figura instanceof Wieza && !((Wieza)rookPole.figura).isMoved() && rookPole.figura.bialy == wybranaFigura.bialy)
                            {
                                boolean pathClear = true;
                                for (int x = currPosition.x + 1; x < 7; x++)
                                {
                                    if (gra.szachownica.pola[x][currPosition.y].zajete())
                                    {
                                        pathClear = false;
                                        break;
                                    }
                                }
                                if (pathClear)
                                {
                                    Pane rookPane = szachownica.getChildren().get(currPosition.y * 8 + 7) instanceof Pane ? (Pane) szachownica.getChildren().get(currPosition.y * 8 + 7) : null;
                                    rookPane.setStyle("-fx-background-color: orange");
                                }
                            }
                        }

                        // Queenside castling
                        if (gra.szachownica.wZakresie(0, currPosition.y))
                        {
                            Pole rookPole = gra.szachownica.pola[0][currPosition.y];
                            if (rookPole.zajete() && rookPole.figura instanceof Wieza && !((Wieza)rookPole.figura).isMoved() && rookPole.figura.bialy == wybranaFigura.bialy)
                            {
                                boolean pathClear = true;
                                for (int x = currPosition.x - 1; x > 0; x--)
                                {
                                    if (gra.szachownica.pola[x][currPosition.y].zajete())
                                    {
                                        pathClear = false;
                                        break;
                                    }
                                }
                                if (pathClear && !gra.szachownica.pola[1][currPosition.y].zajete())
                                {
                                    Pane rookPane = szachownica.getChildren().get(currPosition.y * 8 + 0) instanceof Pane ? (Pane) szachownica.getChildren().get(currPosition.y * 8 + 0) : null;
                                    rookPane.setStyle("-fx-background-color: orange");
                                }
                            }
                        }
                    }

                    // Highlight king for castling if rook is selected
                    if (wybranaFigura instanceof Wieza && !((Wieza)wybranaFigura).isMoved())
                    {
                        Pole kingPole = gra.szachownica.pola[4][currPosition.y];
                        if (kingPole.zajete() && kingPole.figura instanceof Krol && !((Krol)kingPole.figura).isMoved() && kingPole.figura.bialy == wybranaFigura.bialy)
                        {
                            // Kingside castling (rook at h-file)
                            if (currPosition.x == 7)
                            {
                                boolean pathClear = true;
                                for (int x = 5; x < 7; x++)
                                {
                                    if (gra.szachownica.pola[x][currPosition.y].zajete())
                                    {
                                        pathClear = false;
                                        break;
                                    }
                                }
                                if (pathClear)
                                {
                                    Pane kingPane = szachownica.getChildren().get(currPosition.y * 8 + 4) instanceof Pane ? (Pane) szachownica.getChildren().get(currPosition.y * 8 + 4) : null;
                                    kingPane.setStyle("-fx-background-color: orange");
                                }
                            }
                            // Queenside castling (rook at a-file)
                            else if (currPosition.x == 0)
                            {
                                boolean pathClear = true;
                                for (int x = 1; x < 4; x++)
                                {
                                    if (gra.szachownica.pola[x][currPosition.y].zajete())
                                    {
                                        pathClear = false;
                                        break;
                                    }
                                }
                                if (pathClear && !gra.szachownica.pola[1][currPosition.y].zajete())
                                {
                                    Pane kingPane = szachownica.getChildren().get(currPosition.y * 8 + 4) instanceof Pane ? (Pane) szachownica.getChildren().get(currPosition.y * 8 + 4) : null;
                                    kingPane.setStyle("-fx-background-color: orange");
                                }
                            }
                        }
                    }

                    selectedFigure.setStyle("-fx-effect: dropshadow(three-pass-box, yellow, 10, 0, 0, 0);");
                }

                else // wybieranie nowego pola do przemieszczenie wczesniej wybranej figury
                {
                    Position newPosition = positions.get(imageView);
                    Position oldPosition = positions.get(selectedFigure);

                    if(newPosition == oldPosition) // odwybranie figury
                    {
                        clearHighlights(oldPosition);
                        selectedFigure.setStyle(""); // Czyścimy zaznaczenie
                        selectedFigure = null;
                        mozliweRuchy = null;
                        return;
                    }

                    Figury selectedFigura = gra.szachownica.pola[oldPosition.x][oldPosition.y].figura;
                    Figury targetFigura = gra.szachownica.pola[newPosition.x][newPosition.y].figura;

                    // Handle castling (king selecting rook or rook selecting king)
                    boolean isCastlingMove = false;
                    if (selectedFigura instanceof Krol && targetFigura instanceof Wieza && targetFigura.bialy == selectedFigura.bialy && !((Krol)selectedFigura).isMoved() && !((Wieza)targetFigura).isMoved())
                    {
                        // Kingside castling
                        if (newPosition.x == 7 && newPosition.y == oldPosition.y)
                        {
                            boolean pathClear = true;
                            for (int x = oldPosition.x + 1; x < 7; x++)
                            {
                                if (gra.szachownica.pola[x][oldPosition.y].zajete())
                                {
                                    pathClear = false;
                                    break;
                                }
                            }
                            if (pathClear)
                            {
                                selectedFigura.ruch(oldPosition.x + 2, oldPosition.y); // King to g1/g8
                                isCastlingMove = true;
                                // Update UI
                                Pane kingNewPane = szachownica.getChildren().get(oldPosition.y * 8 + 6) instanceof Pane ? (Pane) szachownica.getChildren().get(oldPosition.y * 8 + 6) : null;
                                Pane rookNewPane = szachownica.getChildren().get(oldPosition.y * 8 + 5) instanceof Pane ? (Pane) szachownica.getChildren().get(oldPosition.y * 8 + 5) : null;
                                if (kingNewPane != null && rookNewPane != null)
                                {
                                    ImageView kingNewImage = (ImageView) kingNewPane.getChildren().getFirst();
                                    ImageView rookNewImage = (ImageView) rookNewPane.getChildren().getFirst();
                                    kingNewImage.setImage(selectedFigure.getImage());
                                    rookNewImage.setImage(imageView.getImage());
                                    selectedFigure.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/blank.png")));
                                    imageView.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/blank.png")));
                                    clearHighlights(oldPosition);
                                }
                            }
                        }
                        // Queenside castling
                        else if (newPosition.x == 0 && newPosition.y == oldPosition.y)
                        {
                            boolean pathClear = true;
                            for (int x = oldPosition.x - 1; x > 0; x--)
                            {
                                if (gra.szachownica.pola[x][oldPosition.y].zajete())
                                {
                                    pathClear = false;
                                    break;
                                }
                            }
                            if (pathClear && !gra.szachownica.pola[1][oldPosition.y].zajete())
                            {
                                selectedFigura.ruch(oldPosition.x - 2, oldPosition.y); // King to c1/c8
                                isCastlingMove = true;
                                // Update UI
                                Pane kingNewPane = szachownica.getChildren().get(oldPosition.y * 8 + 2) instanceof Pane ? (Pane) szachownica.getChildren().get(oldPosition.y * 8 + 2) : null;
                                Pane rookNewPane = szachownica.getChildren().get(oldPosition.y * 8 + 3) instanceof Pane ? (Pane) szachownica.getChildren().get(oldPosition.y * 8 + 3) : null;
                                if (kingNewPane != null && rookNewPane != null)
                                {
                                    ImageView kingNewImage = (ImageView) kingNewPane.getChildren().getFirst();
                                    ImageView rookNewImage = (ImageView) rookNewPane.getChildren().getFirst();
                                    kingNewImage.setImage(selectedFigure.getImage());
                                    rookNewImage.setImage(imageView.getImage());
                                    selectedFigure.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/blank.png")));
                                    imageView.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/blank.png")));
                                    clearHighlights(oldPosition);
                                }
                            }
                        }
                    }
                    else if (selectedFigura instanceof Wieza && targetFigura instanceof Krol && targetFigura.bialy == selectedFigura.bialy && !((Wieza)selectedFigura).isMoved() && !((Krol)targetFigura).isMoved())
                    {
                        // Kingside castling
                        if (oldPosition.x == 7 && newPosition.x == 4 && newPosition.y == oldPosition.y)
                        {
                            boolean pathClear = true;
                            for (int x = 5; x < 7; x++)
                            {
                                if (gra.szachownica.pola[x][oldPosition.y].zajete())
                                {
                                    pathClear = false;
                                    break;
                                }
                            }
                            if (pathClear)
                            {
                                selectedFigura.ruch(5, oldPosition.y); // Rook to f1/f8
                                isCastlingMove = true;
                                // Update UI
                                Pane kingNewPane = szachownica.getChildren().get(oldPosition.y * 8 + 6) instanceof Pane ? (Pane) szachownica.getChildren().get(oldPosition.y * 8 + 6) : null;
                                Pane rookNewPane = szachownica.getChildren().get(oldPosition.y * 8 + 5) instanceof Pane ? (Pane) szachownica.getChildren().get(oldPosition.y * 8 + 5) : null;
                                if (kingNewPane != null && rookNewPane != null)
                                {
                                    ImageView kingNewImage = (ImageView) kingNewPane.getChildren().getFirst();
                                    ImageView rookNewImage = (ImageView) rookNewPane.getChildren().getFirst();
                                    kingNewImage.setImage(imageView.getImage());
                                    rookNewImage.setImage(selectedFigure.getImage());
                                    selectedFigure.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/blank.png")));
                                    imageView.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/blank.png")));
                                    clearHighlights(oldPosition);
                                }
                            }
                        }
                        // Queenside castling
                        else if (oldPosition.x == 0 && newPosition.x == 4 && newPosition.y == oldPosition.y)
                        {
                            boolean pathClear = true;
                            for (int x = 1; x < 4; x++)
                            {
                                if (gra.szachownica.pola[x][oldPosition.y].zajete())
                                {
                                    pathClear = false;
                                    break;
                                }
                            }
                            if (pathClear && !gra.szachownica.pola[1][oldPosition.y].zajete())
                            {
                                selectedFigura.ruch(3, oldPosition.y); // Rook to d1/d8
                                isCastlingMove = true;
                                // Update UI
                                Pane kingNewPane = szachownica.getChildren().get(oldPosition.y * 8 + 2) instanceof Pane ? (Pane) szachownica.getChildren().get(oldPosition.y * 8 + 2) : null;
                                Pane rookNewPane = szachownica.getChildren().get(oldPosition.y * 8 + 3) instanceof Pane ? (Pane) szachownica.getChildren().get(oldPosition.y * 8 + 3) : null;
                                if (kingNewPane != null && rookNewPane != null)
                                {
                                    ImageView kingNewImage = (ImageView) kingNewPane.getChildren().getFirst();
                                    ImageView rookNewImage = (ImageView) rookNewPane.getChildren().getFirst();
                                    kingNewImage.setImage(imageView.getImage());
                                    rookNewImage.setImage(selectedFigure.getImage());
                                    selectedFigure.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/blank.png")));
                                    imageView.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/blank.png")));
                                    clearHighlights(oldPosition);
                                }
                            }
                        }
                    }

                    if(!isCastlingMove)
                    {
                        boolean czerks = false;
                        for (Ruch ruch : mozliweRuchy)
                        {
                            if ((newPosition.x == ruch.toX) && (newPosition.y == ruch.toY)) // jesli wybrane pole z puli mozliwego ruchu wszystko ok
                            {
                                czerks = true;
                                break;
                            }
                        }
                        if (!czerks)  //wybranie zlego pola
                            return;

                        gra.szachownica.pola[oldPosition.x][oldPosition.y].figura.ruch(newPosition.x, newPosition.y);
                        imageView.setImage(selectedFigure.getImage());
                        clearHighlights(oldPosition);
                        selectedFigure.setImage(new Image(getClass().getResourceAsStream("/traproom/szachy/images/blank.png"))); // "Usuwamy" figurę ze starego pola
                    }

                    selectedFigure.setStyle(""); // Czyścimy zaznaczenie
                    selectedFigure = null;
                    mozliweRuchy = null;

                    gra.zmienGracza();
                }
        });
    }
}
