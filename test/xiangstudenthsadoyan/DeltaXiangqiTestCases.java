package xiangstudenthsadoyan;


import org.junit.Before;
import org.junit.Test;
import xiangqi.XiangqiGameFactory;
import xiangqi.common.*;

import java.util.concurrent.CompletionException;

import static junit.framework.TestCase.assertEquals;
import static xiangqi.common.XiangqiColor.*;
import static xiangqi.common.XiangqiPieceType.*;
import static xiangstudenthsadoyan.TestPiece.makePiece;
/**
 * Created by gnomeftlc on 3/2/17.
 */
public class DeltaXiangqiTestCases {
    private static XiangqiCoordinate
            c10 = TestCoordinate.makeCoordinate(1, 0),
            c11 = TestCoordinate.makeCoordinate(1, 1),
            c12 = TestCoordinate.makeCoordinate(1, 2),
            c13 = TestCoordinate.makeCoordinate(1, 3),
            c14 = TestCoordinate.makeCoordinate(1, 4),
            c15 = TestCoordinate.makeCoordinate(1, 5),
            c16 = TestCoordinate.makeCoordinate(1, 6),
            c17 = TestCoordinate.makeCoordinate(1, 7),
            c18 = TestCoordinate.makeCoordinate(1, 8),
            c19 = TestCoordinate.makeCoordinate(1, 9),

    c20 = TestCoordinate.makeCoordinate(2, 0),
            c21 = TestCoordinate.makeCoordinate(2, 1),
            c22 = TestCoordinate.makeCoordinate(2, 2),
            c23 = TestCoordinate.makeCoordinate(2, 3),
            c24 = TestCoordinate.makeCoordinate(2, 4),
            c25 = TestCoordinate.makeCoordinate(2, 5),
            c26 = TestCoordinate.makeCoordinate(2, 6),
            c27 = TestCoordinate.makeCoordinate(2, 7),
            c28 = TestCoordinate.makeCoordinate(2, 8),
            c29 = TestCoordinate.makeCoordinate(2, 9),

    c30 = TestCoordinate.makeCoordinate(3, 0),
            c31 = TestCoordinate.makeCoordinate(3, 1),
            c32 = TestCoordinate.makeCoordinate(3, 2),
            c33 = TestCoordinate.makeCoordinate(3, 3),
            c34 = TestCoordinate.makeCoordinate(3, 4),
            c35 = TestCoordinate.makeCoordinate(3, 5),
            c36 = TestCoordinate.makeCoordinate(3, 6),
            c37 = TestCoordinate.makeCoordinate(3, 7),
            c38 = TestCoordinate.makeCoordinate(3, 8),
            c39 = TestCoordinate.makeCoordinate(3, 9),

    c40 = TestCoordinate.makeCoordinate(4, 0),
            c41 = TestCoordinate.makeCoordinate(4, 1),
            c42 = TestCoordinate.makeCoordinate(4, 2),
            c43 = TestCoordinate.makeCoordinate(4, 3),
            c44 = TestCoordinate.makeCoordinate(4, 4),
            c45 = TestCoordinate.makeCoordinate(4, 5),
            c46 = TestCoordinate.makeCoordinate(4, 6),
            c47 = TestCoordinate.makeCoordinate(4, 7),
            c48 = TestCoordinate.makeCoordinate(4, 8),
            c49 = TestCoordinate.makeCoordinate(4, 9),

    c50 = TestCoordinate.makeCoordinate(5, 0),
            c51 = TestCoordinate.makeCoordinate(5, 1),
            c52 = TestCoordinate.makeCoordinate(5, 2),
            c53 = TestCoordinate.makeCoordinate(5, 3),
            c54 = TestCoordinate.makeCoordinate(5, 4),
            c55 = TestCoordinate.makeCoordinate(5, 5),
            c56 = TestCoordinate.makeCoordinate(5, 6),
            c57 = TestCoordinate.makeCoordinate(5, 7),
            c58 = TestCoordinate.makeCoordinate(5, 8),
            c59 = TestCoordinate.makeCoordinate(5, 9),

    c60 = TestCoordinate.makeCoordinate(6, 0),
            c61 = TestCoordinate.makeCoordinate(6, 1),
            c62 = TestCoordinate.makeCoordinate(6, 2),
            c63 = TestCoordinate.makeCoordinate(6, 3),
            c64 = TestCoordinate.makeCoordinate(6, 4),
            c65 = TestCoordinate.makeCoordinate(6, 5),
            c66 = TestCoordinate.makeCoordinate(6, 6),
            c67 = TestCoordinate.makeCoordinate(6, 7),
            c68 = TestCoordinate.makeCoordinate(6, 8),
            c69 = TestCoordinate.makeCoordinate(6, 9),

    c70 = TestCoordinate.makeCoordinate(7, 0),
            c71 = TestCoordinate.makeCoordinate(7, 1),
            c72 = TestCoordinate.makeCoordinate(7, 2),
            c73 = TestCoordinate.makeCoordinate(7, 3),
            c74 = TestCoordinate.makeCoordinate(7, 4),
            c75 = TestCoordinate.makeCoordinate(7, 5),
            c76 = TestCoordinate.makeCoordinate(7, 6),
            c77 = TestCoordinate.makeCoordinate(7, 7),
            c78 = TestCoordinate.makeCoordinate(7, 8),
            c79 = TestCoordinate.makeCoordinate(7, 9),

    c80 = TestCoordinate.makeCoordinate(8, 0),
            c81 = TestCoordinate.makeCoordinate(8, 1),
            c82 = TestCoordinate.makeCoordinate(8, 2),
            c83 = TestCoordinate.makeCoordinate(8, 3),
            c84 = TestCoordinate.makeCoordinate(8, 4),
            c85 = TestCoordinate.makeCoordinate(8, 5),
            c86 = TestCoordinate.makeCoordinate(8, 6),
            c87 = TestCoordinate.makeCoordinate(8, 7),
            c88 = TestCoordinate.makeCoordinate(8, 8),
            c89 = TestCoordinate.makeCoordinate(8, 9),


    c90 = TestCoordinate.makeCoordinate(9, 0),
            c91 = TestCoordinate.makeCoordinate(9, 1),
            c92 = TestCoordinate.makeCoordinate(9, 2),
            c93 = TestCoordinate.makeCoordinate(9, 3),
            c94 = TestCoordinate.makeCoordinate(9, 4),
            c95 = TestCoordinate.makeCoordinate(9, 5),
            c96 = TestCoordinate.makeCoordinate(9, 6),
            c97 = TestCoordinate.makeCoordinate(9, 7),
            c98 = TestCoordinate.makeCoordinate(9, 8),
            c99 = TestCoordinate.makeCoordinate(9, 9),

    c100 = TestCoordinate.makeCoordinate(10, 0),
            c101 = TestCoordinate.makeCoordinate(10, 1),
            c102 = TestCoordinate.makeCoordinate(10, 2),
            c103 = TestCoordinate.makeCoordinate(10, 3),
            c104 = TestCoordinate.makeCoordinate(10, 4),
            c105 = TestCoordinate.makeCoordinate(10, 5),
            c106 = TestCoordinate.makeCoordinate(10, 6),
            c107 = TestCoordinate.makeCoordinate(10, 7),
            c108 = TestCoordinate.makeCoordinate(10, 8),
            c109 = TestCoordinate.makeCoordinate(9, 9);



    private static XiangqiPiece noPiece =
            makePiece(XiangqiPieceType.NONE, XiangqiColor.NONE),
            redChariot = makePiece(CHARIOT, RED),
            redAdvisor = makePiece(ADVISOR, RED),
            redGeneral = makePiece(GENERAL, RED),
            redElephant = makePiece(ELEPHANT, RED),
            redSoldier = makePiece(SOLDIER, RED),
            redHorse = makePiece(HORSE, RED),
            redCannon = makePiece(CANNON, RED),
            blackHorse = makePiece(HORSE, BLACK),
            blackCannon = makePiece(CANNON, BLACK),
            blackChariot = makePiece(CHARIOT, BLACK),
            blackAdvisor = makePiece(ADVISOR, BLACK),
            blackGeneral = makePiece(GENERAL, BLACK),
            blackElephant = makePiece(ELEPHANT, BLACK),
            blackSoldier = makePiece(SOLDIER, BLACK);
    private XiangqiGame game;

    @Before
    public void setup(){
        game = XiangqiGameFactory.makeXiangqiGame(XiangqiGameVersion.DELTA_XQ);
    }


    @Test //1
    public void queryAnEmptyLocation()
    {
        assertEquals(noPiece, game.getPieceAt(c22, BLACK));
    }

    @Test //2
    public void validateStartingRedPiecesInCorrectSpot(){
        assertEquals(redGeneral, game.getPieceAt(c15, RED));
        assertEquals(redSoldier, game.getPieceAt(c41, RED));
        assertEquals(redSoldier, game.getPieceAt(c43, RED));
        assertEquals(redSoldier, game.getPieceAt(c45, RED));
        assertEquals(redSoldier, game.getPieceAt(c47, RED));
        assertEquals(redSoldier, game.getPieceAt(c49, RED));
        assertEquals(redElephant, game.getPieceAt(c13, RED));
        assertEquals(redElephant, game.getPieceAt(c17, RED));
        assertEquals(redChariot, game.getPieceAt(c11, RED));
        assertEquals(redChariot, game.getPieceAt(c19, RED));
        assertEquals(redAdvisor, game.getPieceAt(c14, RED));
        assertEquals(redAdvisor, game.getPieceAt(c16, RED));
        assertEquals(redHorse, game.getPieceAt(c12, RED));
        assertEquals(redHorse, game.getPieceAt(c18, RED));

        assertEquals(redCannon, game.getPieceAt(c32, RED));
        assertEquals(redCannon, game.getPieceAt(c38, RED));

    }

    @Test //3
    public void validateStartingRedPiecesInCorrectSpotBlack(){
        assertEquals(blackGeneral, game.getPieceAt(c15, BLACK));
        assertEquals(blackSoldier, game.getPieceAt(c41, BLACK));
        assertEquals(blackSoldier, game.getPieceAt(c43, BLACK));
        assertEquals(blackSoldier, game.getPieceAt(c45, BLACK));
        assertEquals(blackSoldier, game.getPieceAt(c47, BLACK));
        assertEquals(blackSoldier, game.getPieceAt(c49, BLACK));
        assertEquals(blackElephant, game.getPieceAt(c13, BLACK));
        assertEquals(blackElephant, game.getPieceAt(c17, BLACK));
        assertEquals(blackChariot, game.getPieceAt(c11, BLACK));
        assertEquals(blackChariot, game.getPieceAt(c19, BLACK));
        assertEquals(blackAdvisor, game.getPieceAt(c14, BLACK));
        assertEquals(blackAdvisor, game.getPieceAt(c16, BLACK));
        assertEquals(redHorse, game.getPieceAt(c12, RED));
        assertEquals(redHorse, game.getPieceAt(c18, RED));

        assertEquals(blackCannon, game.getPieceAt(c32, BLACK));
        assertEquals(blackCannon, game.getPieceAt(c38, BLACK));
    }

    @Test //4
    public void testInvalidCoordinateOutOfBounds() {
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c10, c11));
        assertEquals("OUT OF BOUNDS", game.getMoveMessage());

        assertEquals(MoveResult.ILLEGAL, game.makeMove(c11, c30));
        //      assertEquals("OUT OF BOUNDS", game.getMoveMessage());

        assertEquals(MoveResult.ILLEGAL, game.makeMove(TestCoordinate.makeCoordinate(0, 0), TestCoordinate.makeCoordinate(1, 11)));
        //       assertEquals("OUT OF BOUNDS", game.getMoveMessage());

        assertEquals(MoveResult.ILLEGAL, game.makeMove(TestCoordinate.makeCoordinate(0, 0), TestCoordinate.makeCoordinate(0, 1)));
        //       assertEquals("OUT OF BOUNDS", game.getMoveMessage());
    }

    @Test //5
    public void validateGeneralCantLeavePalace(){
        assertEquals(MoveResult.OK, game.makeMove(c15, c25));
        assertEquals(MoveResult.OK, game.makeMove(c15, c25));
        assertEquals(MoveResult.OK, game.makeMove(c25, c24));
        assertEquals(MoveResult.OK, game.makeMove(c25, c24));
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c24, c23));
    }


    @Test //6
    public void validateMoveOnEmptyLocation(){
        assertEquals(MoveResult.ILLEGAL, game.makeMove(TestCoordinate.makeCoordinate(2,2), TestCoordinate.makeCoordinate(3, 3)));
        assertEquals("No Piece At Source", game.getMoveMessage());
    }


    @Test //7
    public void validateIllegalPawnMoves(){
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c43, c44));
        assertEquals("Illegal Soldier Move", game.getMoveMessage());

        assertEquals(MoveResult.ILLEGAL, game.makeMove(c43, c43));
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c43, c42));
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c43, c33));
    }

    @Test //8
    public void validateLegalPawnMoveRed(){
        assertEquals(MoveResult.OK, game.makeMove(c43, c53));
    }

    @Test //9
    public void validateLegalPawnMoveBlack(){
        assertEquals(MoveResult.OK, game.makeMove(c43, c53));
        assertEquals(MoveResult.OK, game.makeMove(c43, c53));
    }


    @Test //10
    public void validateLegalAdvisorMovesRed(){
        assertEquals(MoveResult.OK, game.makeMove(c14, c25));
    }

    @Test //11
    public void validateIllegalAdvisorMovesRed(){
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c14, c23));
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c14, c24));
    }


    @Test //12
    public void validateLegalAdvisorMovesBlack(){
        assertEquals(MoveResult.OK, game.makeMove(c14, c25));
        assertEquals(MoveResult.OK, game.makeMove(c14, c25));
    }

    @Test //13
    public void validateIllegalAdvisorMovesBlack(){
        assertEquals(MoveResult.OK, game.makeMove(c14, c25));
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c14, c23));
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c14, c24));
    }


    @Test //14
    public void validateLegalChariotMovesRed(){
        assertEquals(MoveResult.OK, game.makeMove(c11, c31));
    }

    @Test //15
    public void validateIllegalChariotMovesRed(){
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c11, c22));
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c11, c51));
    }
    @Test //16
    public void validateLegalChariotMovesBlack(){
        assertEquals(MoveResult.OK, game.makeMove(c11, c31));
        assertEquals(MoveResult.OK, game.makeMove(c11, c31));
    }

    @Test //17
    public void validateIllegalChariotMovesBlack(){
        assertEquals(MoveResult.OK, game.makeMove(c11, c31));
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c11, c22));
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c11, c51));
    }
    @Test //18
    public void validateMoveIsSaved(){
        assertEquals(MoveResult.OK , game.makeMove(c11, c21));
        System.out.println(game.getMoveMessage());
        assertEquals(MoveResult.OK, game.makeMove(c11, c21));
        assertEquals(MoveResult.OK, game.makeMove(c21, c22));
    }


    @Test //19
    public void validateCorrectTurnOrder(){
        assertEquals(MoveResult.OK, game.makeMove(c11, c21));
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c101, c91));
        assertEquals("Piece Wrong Color", game.getMoveMessage());
        assertEquals(MoveResult.OK, game.makeMove(c11, c21));
        assertEquals(MoveResult.OK, game.makeMove(c21, c22));
    }


    @Test //20
    public void validateCapture(){

        game.makeMove(c45, c55);
        game.makeMove(c45, c55);
        assertEquals(MoveResult.OK, game.makeMove(c55, c65));
        assertEquals(XiangqiColor.RED, game.getPieceAt(c65, RED).getColor());
    }


    @Test //21
    public void validateCantCaptureOwnPiece(){
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c11, c13));
        assertEquals("Can't Capture Your Own Piece", game.getMoveMessage());
    }

    @Test //22
    public void validateCantJumpOverPieces(){
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c11, c51));
        assertEquals("Can't Jump Over A Piece", game.getMoveMessage());
    }

    @Test //23
    public void validatePawnCantMoveBack(){
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c41, c31));
    }

    @Test //24
    public void validateIllegalElephantMove(){
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c13, c24));
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c13, c23));
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c13, c22));
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c13, c46));
    }

    @Test //25
    public void validateLegalElephantMove(){
        assertEquals(MoveResult.OK, game.makeMove(c13, c35));
        assertEquals(MoveResult.OK, game.makeMove(c13, c31));
    }

    @Test //26
    public void validateElephantCantCrossRiver(){
        assertEquals(MoveResult.OK, game.makeMove(c13, c35));
        assertEquals(MoveResult.OK, game.makeMove(c13, c35));
        assertEquals(MoveResult.OK, game.makeMove(c35, c53));
        assertEquals(MoveResult.OK, game.makeMove(c35, c53));
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c53, c75));
    }

    @Test //27
    public void validateSoldierCanMoveHorizontallyAfterCrossingRiver(){

        assertEquals(MoveResult.OK, game.makeMove(c15, c25));
        assertEquals(MoveResult.OK, game.makeMove(c15, c25));
        assertEquals(MoveResult.OK, game.makeMove(c25, c24));
        assertEquals(MoveResult.OK, game.makeMove(c25, c15));
        assertEquals(MoveResult.OK, game.makeMove(c45, c55));
        assertEquals(MoveResult.OK, game.makeMove(c45, c55));
        assertEquals(MoveResult.OK, game.makeMove(c55, c65));
        assertEquals(MoveResult.OK, game.makeMove(c11, c21));
        assertEquals(MoveResult.OK, game.makeMove(c65, c66));
    }

    @Test //28
    public void validateFlyingGeneralsMove(){
        assertEquals(MoveResult.OK, game.makeMove(c15, c25));
        assertEquals(MoveResult.OK, game.makeMove(c15, c25));
        assertEquals(MoveResult.OK, game.makeMove(c25, c24));
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c25, c26));
    }


    @Test //29
    public void completeGame() {
        assertEquals(MoveResult.OK, game.makeMove(c11, c21));
        assertEquals(MoveResult.OK, game.makeMove(c19, c29));
        assertEquals(MoveResult.OK, game.makeMove(c21, c24));
        assertEquals(MoveResult.OK, game.makeMove(c29, c19));
        assertEquals(MoveResult.OK, game.makeMove(c24, c94));
        assertEquals(MoveResult.OK, game.makeMove(c19, c29));
        assertEquals(MoveResult.OK, game.makeMove(c94, c93));
        assertEquals(MoveResult.OK, game.makeMove(c29, c19));
        assertEquals(MoveResult.OK, game.makeMove(c19, c29));
        assertEquals(MoveResult.OK, game.makeMove(c13, c31));
        assertEquals(MoveResult.OK, game.makeMove(c29, c24));
        assertEquals(MoveResult.OK, game.makeMove(c17, c39));
        assertEquals(MoveResult.OK, game.makeMove(c93, c103));
        assertEquals(MoveResult.OK, game.makeMove(c39, c57));
        assertEquals(MoveResult.OK, game.makeMove(c24, c94));
        assertEquals(MoveResult.OK, game.makeMove(c19, c29));
        assertEquals(MoveResult.RED_WINS, game.makeMove(c103, c104));
    }
    @Test (expected = CompletionException.class)
    public void validateGetPieceAtThrowsException(){
        game.getPieceAt(c10, RED);
    }

    @Test //30
    public void validateCannonMove(){
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c32, c43));
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c32, c82));
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c32, c92));
        assertEquals(MoveResult.OK, game.makeMove(c32, c102));
        assertEquals(MoveResult.OK, game.makeMove(c32, c42));
        assertEquals(MoveResult.OK, game.makeMove(c11, c21));
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c32, c45));
    }

    @Test //31
    public void validateHorseMove() {
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c12, c22));
        assertEquals(MoveResult.OK, game.makeMove(c32, c42));
        assertEquals(MoveResult.OK, game.makeMove(c32, c42));
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c12, c32));
        assertEquals(MoveResult.OK, game.makeMove(c12, c31));
    }

    @Test //32
    public void validateHorseCantJumpOverPiece(){
        assertEquals(MoveResult.OK, game.makeMove(c32, c22));
        assertEquals(MoveResult.OK, game.makeMove(c32, c22));
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c12, c31));
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c12, c24));
        assertEquals(MoveResult.ILLEGAL, game.makeMove(c12, c26));
    }

    @Test //33
    public void validateRepetitionResultsInGameOver(){
        assertEquals(MoveResult.OK, game.makeMove(c15, c25));
        assertEquals(MoveResult.OK, game.makeMove(c15, c25));
        assertEquals(MoveResult.OK, game.makeMove(c25, c15));
        assertEquals(MoveResult.OK, game.makeMove(c25, c15));
        assertEquals(MoveResult.OK, game.makeMove(c15, c25));
        assertEquals(MoveResult.OK, game.makeMove(c15, c25));
        assertEquals(MoveResult.OK, game.makeMove(c25, c15));
        assertEquals(MoveResult.OK, game.makeMove(c25, c15));
        assertEquals(MoveResult.BLACK_WINS, game.makeMove(c15, c25));
    }

}
