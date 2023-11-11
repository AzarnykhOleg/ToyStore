package com.toy_store.App;

import com.toy_store.Accessory.ToysRandom;
import com.toy_store.Presenter.PresenterConsole;
import com.toy_store.View.ConsoleView;
import com.toy_store.View.View;

public class App {
    View view;
    ToysRandom toysRandom;
    PresenterConsole presenter;


    public App() {
        this.view = new ConsoleView();
        this.toysRandom = new ToysRandom();
        this.presenter = new PresenterConsole(this.view, this.toysRandom);
    }

    public void ShowMenu(){
        String menu = "1. Create Toy \n" + 
                "2. Remove Toy \n" + 
                "3. Edit Toys Frequency \n" +
                "4. Play \n" + 
                "5. Watch result \n" +
                "6. Watch all toys in the shop \n" +  
                "7. Save and exit \n";
        view.Set(menu);
    }

    public void Start(){
        presenter.LoadToys();
        boolean work = true;
        while (work) {
            ShowMenu();
            view.Set("Enter number of required action");
            try {
                Integer choise = Integer.parseInt(view.Get());
                switch (choise) {
                    case 1:
                        presenter.CreateToy();
                        break;
                    case 2:
                        presenter.RemoveToy();
                       break;
                    case 3:
                        presenter.EditFrequencyToy();
                        break;
                    case 4:
                        presenter.PlayToy();
                        break;
                    case 5:
                        view.Set(presenter.getWonToys().toString());
                        break;
                    case 6:
                        view.Set(presenter.getShopToys().toString());
                        break;
                    case 7:
                        presenter.SaveToys();
                        work = false;
                        break;
                    default:
                        view.Set("Enter number from 1 to 7");
                        break;
                }
                
            } catch (RuntimeException e) {
                view.Set("Enter number from 1 to 7");
            }
        }
    }
}
