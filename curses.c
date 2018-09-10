#include <ncurses.h>
#include <stdio.h>
int main(){
    initscr();
    box(stdscr,ACS_VLINE,ACS_HLINE);
    move(LINES/2,COLS/2);
    waddstr(stdscr,"hello world");
    refresh();
    getch();
    endwin();
    return 0;
}