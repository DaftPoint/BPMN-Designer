/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.bpmn2.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart;

import org.obeonetwork.dsl.bpmn2.providers.Bpmn2Messages;

// End of user code

/**
 * 
 * 
 */
public class ParticipantPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ParticipantPropertiesEditionPart {

	protected Text id;
	protected ReferencesTable extensionDefinitions;
	protected List<ViewerFilter> extensionDefinitionsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> extensionDefinitionsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable extensionValues;
	protected List<ViewerFilter> extensionValuesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> extensionValuesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable documentation;
	protected List<ViewerFilter> documentationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> documentationFilters = new ArrayList<ViewerFilter>();
	protected Text name;
	protected ReferencesTable interfaceRefs;
	protected List<ViewerFilter> interfaceRefsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> interfaceRefsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable endPointRefs;
	protected List<ViewerFilter> endPointRefsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> endPointRefsFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer processRef;



	/**
	 * For {@link ISection} use only.
	 */
	public ParticipantPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ParticipantPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence participantStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = participantStep.addStep(Bpmn2ViewsRepository.Participant.Properties.class);
		propertiesStep.addStep(Bpmn2ViewsRepository.Participant.Properties.id);
		propertiesStep.addStep(Bpmn2ViewsRepository.Participant.Properties.extensionDefinitions);
		propertiesStep.addStep(Bpmn2ViewsRepository.Participant.Properties.extensionValues);
		propertiesStep.addStep(Bpmn2ViewsRepository.Participant.Properties.documentation);
		propertiesStep.addStep(Bpmn2ViewsRepository.Participant.Properties.name);
		propertiesStep.addStep(Bpmn2ViewsRepository.Participant.Properties.interfaceRefs);
		propertiesStep.addStep(Bpmn2ViewsRepository.Participant.Properties.endPointRefs);
		propertiesStep.addStep(Bpmn2ViewsRepository.Participant.Properties.processRef);
		
		
		composer = new PartComposer(participantStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Bpmn2ViewsRepository.Participant.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Participant.Properties.id) {
					return createIdText(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Participant.Properties.extensionDefinitions) {
					return createExtensionDefinitionsReferencesTable(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Participant.Properties.extensionValues) {
					return createExtensionValuesTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Participant.Properties.documentation) {
					return createDocumentationTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Participant.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Participant.Properties.interfaceRefs) {
					return createInterfaceRefsReferencesTable(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Participant.Properties.endPointRefs) {
					return createEndPointRefsReferencesTable(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.Participant.Properties.processRef) {
					return createProcessRefFlatComboViewer(parent, widgetFactory);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(Bpmn2Messages.ParticipantPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createIdText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.Participant.Properties.id, Bpmn2Messages.ParticipantPropertiesEditionPart_IdLabel);
		id = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		id.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData idData = new GridData(GridData.FILL_HORIZONTAL);
		id.setLayoutData(idData);
		id.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ParticipantPropertiesEditionPartForm.this,
							Bpmn2ViewsRepository.Participant.Properties.id,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ParticipantPropertiesEditionPartForm.this,
									Bpmn2ViewsRepository.Participant.Properties.id,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, id.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ParticipantPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		id.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Participant.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, Bpmn2ViewsRepository.Participant.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Participant.Properties.id, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createExtensionDefinitionsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.extensionDefinitions = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Participant.Properties.extensionDefinitions, Bpmn2Messages.ParticipantPropertiesEditionPart_ExtensionDefinitionsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addExtensionDefinitions(); }
			public void handleEdit(EObject element) { editExtensionDefinitions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveExtensionDefinitions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromExtensionDefinitions(element); }
			public void navigateTo(EObject element) { }
		});
		this.extensionDefinitions.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Participant.Properties.extensionDefinitions, Bpmn2ViewsRepository.FORM_KIND));
		this.extensionDefinitions.createControls(parent, widgetFactory);
		this.extensionDefinitions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Participant.Properties.extensionDefinitions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionDefinitionsData = new GridData(GridData.FILL_HORIZONTAL);
		extensionDefinitionsData.horizontalSpan = 3;
		this.extensionDefinitions.setLayoutData(extensionDefinitionsData);
		this.extensionDefinitions.disableMove();
		extensionDefinitions.setID(Bpmn2ViewsRepository.Participant.Properties.extensionDefinitions);
		extensionDefinitions.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addExtensionDefinitions() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(extensionDefinitions.getInput(), extensionDefinitionsFilters, extensionDefinitionsBusinessFilters,
		"extensionDefinitions", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Participant.Properties.extensionDefinitions,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				extensionDefinitions.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveExtensionDefinitions(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Participant.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		extensionDefinitions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromExtensionDefinitions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Participant.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		extensionDefinitions.refresh();
	}

	/**
	 * 
	 */
	protected void editExtensionDefinitions(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				extensionDefinitions.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createExtensionValuesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.extensionValues = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Participant.Properties.extensionValues, Bpmn2Messages.ParticipantPropertiesEditionPart_ExtensionValuesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Participant.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				extensionValues.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Participant.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				extensionValues.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Participant.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				extensionValues.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Participant.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				extensionValues.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.extensionValuesFilters) {
			this.extensionValues.addFilter(filter);
		}
		this.extensionValues.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Participant.Properties.extensionValues, Bpmn2ViewsRepository.FORM_KIND));
		this.extensionValues.createControls(parent, widgetFactory);
		this.extensionValues.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Participant.Properties.extensionValues, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionValuesData = new GridData(GridData.FILL_HORIZONTAL);
		extensionValuesData.horizontalSpan = 3;
		this.extensionValues.setLayoutData(extensionValuesData);
		this.extensionValues.setLowerBound(0);
		this.extensionValues.setUpperBound(-1);
		extensionValues.setID(Bpmn2ViewsRepository.Participant.Properties.extensionValues);
		extensionValues.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDocumentationTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.documentation = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Participant.Properties.documentation, Bpmn2Messages.ParticipantPropertiesEditionPart_DocumentationLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Participant.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				documentation.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Participant.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				documentation.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Participant.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				documentation.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Participant.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				documentation.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.documentationFilters) {
			this.documentation.addFilter(filter);
		}
		this.documentation.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Participant.Properties.documentation, Bpmn2ViewsRepository.FORM_KIND));
		this.documentation.createControls(parent, widgetFactory);
		this.documentation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Participant.Properties.documentation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData documentationData = new GridData(GridData.FILL_HORIZONTAL);
		documentationData.horizontalSpan = 3;
		this.documentation.setLayoutData(documentationData);
		this.documentation.setLowerBound(0);
		this.documentation.setUpperBound(-1);
		documentation.setID(Bpmn2ViewsRepository.Participant.Properties.documentation);
		documentation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.Participant.Properties.name, Bpmn2Messages.ParticipantPropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ParticipantPropertiesEditionPartForm.this,
							Bpmn2ViewsRepository.Participant.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ParticipantPropertiesEditionPartForm.this,
									Bpmn2ViewsRepository.Participant.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ParticipantPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Participant.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, Bpmn2ViewsRepository.Participant.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Participant.Properties.name, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createInterfaceRefsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.interfaceRefs = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Participant.Properties.interfaceRefs, Bpmn2Messages.ParticipantPropertiesEditionPart_InterfaceRefsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addInterfaceRefs(); }
			public void handleEdit(EObject element) { editInterfaceRefs(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveInterfaceRefs(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromInterfaceRefs(element); }
			public void navigateTo(EObject element) { }
		});
		this.interfaceRefs.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Participant.Properties.interfaceRefs, Bpmn2ViewsRepository.FORM_KIND));
		this.interfaceRefs.createControls(parent, widgetFactory);
		this.interfaceRefs.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Participant.Properties.interfaceRefs, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData interfaceRefsData = new GridData(GridData.FILL_HORIZONTAL);
		interfaceRefsData.horizontalSpan = 3;
		this.interfaceRefs.setLayoutData(interfaceRefsData);
		this.interfaceRefs.disableMove();
		interfaceRefs.setID(Bpmn2ViewsRepository.Participant.Properties.interfaceRefs);
		interfaceRefs.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addInterfaceRefs() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(interfaceRefs.getInput(), interfaceRefsFilters, interfaceRefsBusinessFilters,
		"interfaceRefs", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Participant.Properties.interfaceRefs,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				interfaceRefs.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveInterfaceRefs(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Participant.Properties.interfaceRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		interfaceRefs.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromInterfaceRefs(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Participant.Properties.interfaceRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		interfaceRefs.refresh();
	}

	/**
	 * 
	 */
	protected void editInterfaceRefs(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				interfaceRefs.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createEndPointRefsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.endPointRefs = new ReferencesTable(getDescription(Bpmn2ViewsRepository.Participant.Properties.endPointRefs, Bpmn2Messages.ParticipantPropertiesEditionPart_EndPointRefsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addEndPointRefs(); }
			public void handleEdit(EObject element) { editEndPointRefs(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveEndPointRefs(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromEndPointRefs(element); }
			public void navigateTo(EObject element) { }
		});
		this.endPointRefs.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Participant.Properties.endPointRefs, Bpmn2ViewsRepository.FORM_KIND));
		this.endPointRefs.createControls(parent, widgetFactory);
		this.endPointRefs.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Participant.Properties.endPointRefs, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData endPointRefsData = new GridData(GridData.FILL_HORIZONTAL);
		endPointRefsData.horizontalSpan = 3;
		this.endPointRefs.setLayoutData(endPointRefsData);
		this.endPointRefs.disableMove();
		endPointRefs.setID(Bpmn2ViewsRepository.Participant.Properties.endPointRefs);
		endPointRefs.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addEndPointRefs() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(endPointRefs.getInput(), endPointRefsFilters, endPointRefsBusinessFilters,
		"endPointRefs", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Participant.Properties.endPointRefs,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				endPointRefs.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveEndPointRefs(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Participant.Properties.endPointRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		endPointRefs.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromEndPointRefs(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Participant.Properties.endPointRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		endPointRefs.refresh();
	}

	/**
	 * 
	 */
	protected void editEndPointRefs(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				endPointRefs.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createProcessRefFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, Bpmn2ViewsRepository.Participant.Properties.processRef, Bpmn2Messages.ParticipantPropertiesEditionPart_ProcessRefLabel);
		processRef = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Bpmn2ViewsRepository.Participant.Properties.processRef, Bpmn2ViewsRepository.FORM_KIND));
		widgetFactory.adapt(processRef);
		processRef.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData processRefData = new GridData(GridData.FILL_HORIZONTAL);
		processRef.setLayoutData(processRefData);
		processRef.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ParticipantPropertiesEditionPartForm.this, Bpmn2ViewsRepository.Participant.Properties.processRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getProcessRef()));
			}

		});
		processRef.setID(Bpmn2ViewsRepository.Participant.Properties.processRef);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.Participant.Properties.processRef, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#initExtensionDefinitions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initExtensionDefinitions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		extensionDefinitions.setContentProvider(contentProvider);
		extensionDefinitions.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#updateExtensionDefinitions()
	 * 
	 */
	public void updateExtensionDefinitions() {
	extensionDefinitions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#addFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#addBusinessFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#isContainedInExtensionDefinitionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionDefinitionsTable(EObject element) {
		return ((ReferencesTableSettings)extensionDefinitions.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#initExtensionValues(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initExtensionValues(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		extensionValues.setContentProvider(contentProvider);
		extensionValues.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#updateExtensionValues()
	 * 
	 */
	public void updateExtensionValues() {
	extensionValues.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#addFilterExtensionValues(ViewerFilter filter)
	 * 
	 */
	public void addFilterToExtensionValues(ViewerFilter filter) {
		extensionValuesFilters.add(filter);
		if (this.extensionValues != null) {
			this.extensionValues.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#addBusinessFilterExtensionValues(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionValues(ViewerFilter filter) {
		extensionValuesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#isContainedInExtensionValuesTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionValuesTable(EObject element) {
		return ((ReferencesTableSettings)extensionValues.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#initDocumentation(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initDocumentation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		documentation.setContentProvider(contentProvider);
		documentation.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#updateDocumentation()
	 * 
	 */
	public void updateDocumentation() {
	documentation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#addFilterDocumentation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDocumentation(ViewerFilter filter) {
		documentationFilters.add(filter);
		if (this.documentation != null) {
			this.documentation.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#addBusinessFilterDocumentation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDocumentation(ViewerFilter filter) {
		documentationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#isContainedInDocumentationTable(EObject element)
	 * 
	 */
	public boolean isContainedInDocumentationTable(EObject element) {
		return ((ReferencesTableSettings)documentation.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#initInterfaceRefs(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initInterfaceRefs(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		interfaceRefs.setContentProvider(contentProvider);
		interfaceRefs.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#updateInterfaceRefs()
	 * 
	 */
	public void updateInterfaceRefs() {
	interfaceRefs.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#addFilterInterfaceRefs(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInterfaceRefs(ViewerFilter filter) {
		interfaceRefsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#addBusinessFilterInterfaceRefs(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInterfaceRefs(ViewerFilter filter) {
		interfaceRefsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#isContainedInInterfaceRefsTable(EObject element)
	 * 
	 */
	public boolean isContainedInInterfaceRefsTable(EObject element) {
		return ((ReferencesTableSettings)interfaceRefs.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#initEndPointRefs(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initEndPointRefs(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		endPointRefs.setContentProvider(contentProvider);
		endPointRefs.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#updateEndPointRefs()
	 * 
	 */
	public void updateEndPointRefs() {
	endPointRefs.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#addFilterEndPointRefs(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEndPointRefs(ViewerFilter filter) {
		endPointRefsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#addBusinessFilterEndPointRefs(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEndPointRefs(ViewerFilter filter) {
		endPointRefsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#isContainedInEndPointRefsTable(EObject element)
	 * 
	 */
	public boolean isContainedInEndPointRefsTable(EObject element) {
		return ((ReferencesTableSettings)endPointRefs.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#getProcessRef()
	 * 
	 */
	public EObject getProcessRef() {
		if (processRef.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) processRef.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#initProcessRef(EObjectFlatComboSettings)
	 */
	public void initProcessRef(EObjectFlatComboSettings settings) {
		processRef.setInput(settings);
		if (current != null) {
			processRef.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#setProcessRef(EObject newValue)
	 * 
	 */
	public void setProcessRef(EObject newValue) {
		if (newValue != null) {
			processRef.setSelection(new StructuredSelection(newValue));
		} else {
			processRef.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#setProcessRefButtonMode(ButtonsModeEnum newValue)
	 */
	public void setProcessRefButtonMode(ButtonsModeEnum newValue) {
		processRef.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#addFilterProcessRef(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProcessRef(ViewerFilter filter) {
		processRef.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.ParticipantPropertiesEditionPart#addBusinessFilterProcessRef(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProcessRef(ViewerFilter filter) {
		processRef.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Bpmn2Messages.Participant_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
