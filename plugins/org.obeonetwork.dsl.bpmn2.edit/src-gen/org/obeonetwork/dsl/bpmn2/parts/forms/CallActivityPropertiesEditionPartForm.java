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

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import org.obeonetwork.dsl.bpmn2.parts.Bpmn2ViewsRepository;
import org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart;

import org.obeonetwork.dsl.bpmn2.providers.Bpmn2Messages;

// End of user code

/**
 * 
 * 
 */
public class CallActivityPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, CallActivityPropertiesEditionPart {

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
	protected ReferencesTable categoryValueRef;
	protected List<ViewerFilter> categoryValueRefBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> categoryValueRefFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable outgoing;
	protected List<ViewerFilter> outgoingBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> outgoingFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable incoming;
	protected List<ViewerFilter> incomingBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> incomingFilters = new ArrayList<ViewerFilter>();
	protected Button isForCompensation;
	protected ReferencesTable resources;
	protected List<ViewerFilter> resourcesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> resourcesFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer default_;
	protected ReferencesTable properties;
	protected List<ViewerFilter> propertiesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> propertiesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable boundaryEventRefs;
	protected List<ViewerFilter> boundaryEventRefsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> boundaryEventRefsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable dataInputAssociations;
	protected List<ViewerFilter> dataInputAssociationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> dataInputAssociationsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable dataOutputAssociations;
	protected List<ViewerFilter> dataOutputAssociationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> dataOutputAssociationsFilters = new ArrayList<ViewerFilter>();
	protected Text startQuantity;
	protected Text completionQuantity;
	protected EObjectFlatComboViewer calledElementRef;



	/**
	 * For {@link ISection} use only.
	 */
	public CallActivityPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public CallActivityPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence callActivityStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = callActivityStep.addStep(Bpmn2ViewsRepository.CallActivity.Properties.class);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallActivity.Properties.id);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallActivity.Properties.extensionDefinitions);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallActivity.Properties.extensionValues);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallActivity.Properties.documentation);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallActivity.Properties.name);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallActivity.Properties.categoryValueRef);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallActivity.Properties.outgoing);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallActivity.Properties.incoming);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallActivity.Properties.isForCompensation);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallActivity.Properties.resources);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallActivity.Properties.default_);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallActivity.Properties.properties_);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallActivity.Properties.boundaryEventRefs);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallActivity.Properties.dataInputAssociations);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallActivity.Properties.dataOutputAssociations);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallActivity.Properties.startQuantity);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallActivity.Properties.completionQuantity);
		propertiesStep.addStep(Bpmn2ViewsRepository.CallActivity.Properties.calledElementRef);
		
		
		composer = new PartComposer(callActivityStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == Bpmn2ViewsRepository.CallActivity.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallActivity.Properties.id) {
					return createIdText(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallActivity.Properties.extensionDefinitions) {
					return createExtensionDefinitionsReferencesTable(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallActivity.Properties.extensionValues) {
					return createExtensionValuesTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallActivity.Properties.documentation) {
					return createDocumentationTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallActivity.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallActivity.Properties.categoryValueRef) {
					return createCategoryValueRefReferencesTable(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallActivity.Properties.outgoing) {
					return createOutgoingReferencesTable(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallActivity.Properties.incoming) {
					return createIncomingReferencesTable(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallActivity.Properties.isForCompensation) {
					return createIsForCompensationCheckbox(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallActivity.Properties.resources) {
					return createResourcesTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallActivity.Properties.default_) {
					return createDefault_FlatComboViewer(parent, widgetFactory);
				}
				if (key == Bpmn2ViewsRepository.CallActivity.Properties.properties_) {
					return createPropertiesTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallActivity.Properties.boundaryEventRefs) {
					return createBoundaryEventRefsReferencesTable(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallActivity.Properties.dataInputAssociations) {
					return createDataInputAssociationsTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallActivity.Properties.dataOutputAssociations) {
					return createDataOutputAssociationsTableComposition(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallActivity.Properties.startQuantity) {
					return createStartQuantityText(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallActivity.Properties.completionQuantity) {
					return createCompletionQuantityText(widgetFactory, parent);
				}
				if (key == Bpmn2ViewsRepository.CallActivity.Properties.calledElementRef) {
					return createCalledElementRefFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(Bpmn2Messages.CallActivityPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, Bpmn2ViewsRepository.CallActivity.Properties.id, Bpmn2Messages.CallActivityPropertiesEditionPart_IdLabel);
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
							CallActivityPropertiesEditionPartForm.this,
							Bpmn2ViewsRepository.CallActivity.Properties.id,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CallActivityPropertiesEditionPartForm.this,
									Bpmn2ViewsRepository.CallActivity.Properties.id,
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
									CallActivityPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, Bpmn2ViewsRepository.CallActivity.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallActivity.Properties.id, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createExtensionDefinitionsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.extensionDefinitions = new ReferencesTable(getDescription(Bpmn2ViewsRepository.CallActivity.Properties.extensionDefinitions, Bpmn2Messages.CallActivityPropertiesEditionPart_ExtensionDefinitionsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addExtensionDefinitions(); }
			public void handleEdit(EObject element) { editExtensionDefinitions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveExtensionDefinitions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromExtensionDefinitions(element); }
			public void navigateTo(EObject element) { }
		});
		this.extensionDefinitions.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallActivity.Properties.extensionDefinitions, Bpmn2ViewsRepository.FORM_KIND));
		this.extensionDefinitions.createControls(parent, widgetFactory);
		this.extensionDefinitions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.extensionDefinitions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionDefinitionsData = new GridData(GridData.FILL_HORIZONTAL);
		extensionDefinitionsData.horizontalSpan = 3;
		this.extensionDefinitions.setLayoutData(extensionDefinitionsData);
		this.extensionDefinitions.disableMove();
		extensionDefinitions.setID(Bpmn2ViewsRepository.CallActivity.Properties.extensionDefinitions);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.extensionDefinitions,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		extensionDefinitions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromExtensionDefinitions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.extensionDefinitions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.extensionValues = new ReferencesTable(getDescription(Bpmn2ViewsRepository.CallActivity.Properties.extensionValues, Bpmn2Messages.CallActivityPropertiesEditionPart_ExtensionValuesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				extensionValues.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				extensionValues.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				extensionValues.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.extensionValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				extensionValues.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.extensionValuesFilters) {
			this.extensionValues.addFilter(filter);
		}
		this.extensionValues.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallActivity.Properties.extensionValues, Bpmn2ViewsRepository.FORM_KIND));
		this.extensionValues.createControls(parent, widgetFactory);
		this.extensionValues.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.extensionValues, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData extensionValuesData = new GridData(GridData.FILL_HORIZONTAL);
		extensionValuesData.horizontalSpan = 3;
		this.extensionValues.setLayoutData(extensionValuesData);
		this.extensionValues.setLowerBound(0);
		this.extensionValues.setUpperBound(-1);
		extensionValues.setID(Bpmn2ViewsRepository.CallActivity.Properties.extensionValues);
		extensionValues.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDocumentationTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.documentation = new ReferencesTable(getDescription(Bpmn2ViewsRepository.CallActivity.Properties.documentation, Bpmn2Messages.CallActivityPropertiesEditionPart_DocumentationLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				documentation.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				documentation.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				documentation.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.documentation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				documentation.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.documentationFilters) {
			this.documentation.addFilter(filter);
		}
		this.documentation.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallActivity.Properties.documentation, Bpmn2ViewsRepository.FORM_KIND));
		this.documentation.createControls(parent, widgetFactory);
		this.documentation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.documentation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData documentationData = new GridData(GridData.FILL_HORIZONTAL);
		documentationData.horizontalSpan = 3;
		this.documentation.setLayoutData(documentationData);
		this.documentation.setLowerBound(0);
		this.documentation.setUpperBound(-1);
		documentation.setID(Bpmn2ViewsRepository.CallActivity.Properties.documentation);
		documentation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.CallActivity.Properties.name, Bpmn2Messages.CallActivityPropertiesEditionPart_NameLabel);
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
							CallActivityPropertiesEditionPartForm.this,
							Bpmn2ViewsRepository.CallActivity.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CallActivityPropertiesEditionPartForm.this,
									Bpmn2ViewsRepository.CallActivity.Properties.name,
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
									CallActivityPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, Bpmn2ViewsRepository.CallActivity.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallActivity.Properties.name, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createCategoryValueRefReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.categoryValueRef = new ReferencesTable(getDescription(Bpmn2ViewsRepository.CallActivity.Properties.categoryValueRef, Bpmn2Messages.CallActivityPropertiesEditionPart_CategoryValueRefLabel), new ReferencesTableListener	() {
			public void handleAdd() { addCategoryValueRef(); }
			public void handleEdit(EObject element) { editCategoryValueRef(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCategoryValueRef(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCategoryValueRef(element); }
			public void navigateTo(EObject element) { }
		});
		this.categoryValueRef.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallActivity.Properties.categoryValueRef, Bpmn2ViewsRepository.FORM_KIND));
		this.categoryValueRef.createControls(parent, widgetFactory);
		this.categoryValueRef.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.categoryValueRef, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData categoryValueRefData = new GridData(GridData.FILL_HORIZONTAL);
		categoryValueRefData.horizontalSpan = 3;
		this.categoryValueRef.setLayoutData(categoryValueRefData);
		this.categoryValueRef.disableMove();
		categoryValueRef.setID(Bpmn2ViewsRepository.CallActivity.Properties.categoryValueRef);
		categoryValueRef.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addCategoryValueRef() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(categoryValueRef.getInput(), categoryValueRefFilters, categoryValueRefBusinessFilters,
		"categoryValueRef", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.categoryValueRef,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				categoryValueRef.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveCategoryValueRef(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.categoryValueRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		categoryValueRef.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCategoryValueRef(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.categoryValueRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		categoryValueRef.refresh();
	}

	/**
	 * 
	 */
	protected void editCategoryValueRef(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				categoryValueRef.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createOutgoingReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.outgoing = new ReferencesTable(getDescription(Bpmn2ViewsRepository.CallActivity.Properties.outgoing, Bpmn2Messages.CallActivityPropertiesEditionPart_OutgoingLabel), new ReferencesTableListener	() {
			public void handleAdd() { addOutgoing(); }
			public void handleEdit(EObject element) { editOutgoing(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutgoing(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutgoing(element); }
			public void navigateTo(EObject element) { }
		});
		this.outgoing.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallActivity.Properties.outgoing, Bpmn2ViewsRepository.FORM_KIND));
		this.outgoing.createControls(parent, widgetFactory);
		this.outgoing.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.outgoing, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outgoingData = new GridData(GridData.FILL_HORIZONTAL);
		outgoingData.horizontalSpan = 3;
		this.outgoing.setLayoutData(outgoingData);
		this.outgoing.disableMove();
		outgoing.setID(Bpmn2ViewsRepository.CallActivity.Properties.outgoing);
		outgoing.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOutgoing() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(outgoing.getInput(), outgoingFilters, outgoingBusinessFilters,
		"outgoing", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.outgoing,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				outgoing.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOutgoing(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.outgoing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outgoing.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutgoing(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.outgoing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		outgoing.refresh();
	}

	/**
	 * 
	 */
	protected void editOutgoing(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				outgoing.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createIncomingReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.incoming = new ReferencesTable(getDescription(Bpmn2ViewsRepository.CallActivity.Properties.incoming, Bpmn2Messages.CallActivityPropertiesEditionPart_IncomingLabel), new ReferencesTableListener	() {
			public void handleAdd() { addIncoming(); }
			public void handleEdit(EObject element) { editIncoming(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIncoming(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIncoming(element); }
			public void navigateTo(EObject element) { }
		});
		this.incoming.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallActivity.Properties.incoming, Bpmn2ViewsRepository.FORM_KIND));
		this.incoming.createControls(parent, widgetFactory);
		this.incoming.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.incoming, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData incomingData = new GridData(GridData.FILL_HORIZONTAL);
		incomingData.horizontalSpan = 3;
		this.incoming.setLayoutData(incomingData);
		this.incoming.disableMove();
		incoming.setID(Bpmn2ViewsRepository.CallActivity.Properties.incoming);
		incoming.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addIncoming() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(incoming.getInput(), incomingFilters, incomingBusinessFilters,
		"incoming", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.incoming,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				incoming.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIncoming(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.incoming, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		incoming.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIncoming(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.incoming, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		incoming.refresh();
	}

	/**
	 * 
	 */
	protected void editIncoming(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				incoming.refresh();
			}
		}
	}

	
	protected Composite createIsForCompensationCheckbox(FormToolkit widgetFactory, Composite parent) {
		isForCompensation = widgetFactory.createButton(parent, getDescription(Bpmn2ViewsRepository.CallActivity.Properties.isForCompensation, Bpmn2Messages.CallActivityPropertiesEditionPart_IsForCompensationLabel), SWT.CHECK);
		isForCompensation.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.isForCompensation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isForCompensation.getSelection())));
			}

		});
		GridData isForCompensationData = new GridData(GridData.FILL_HORIZONTAL);
		isForCompensationData.horizontalSpan = 2;
		isForCompensation.setLayoutData(isForCompensationData);
		EditingUtils.setID(isForCompensation, Bpmn2ViewsRepository.CallActivity.Properties.isForCompensation);
		EditingUtils.setEEFtype(isForCompensation, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallActivity.Properties.isForCompensation, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createResourcesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.resources = new ReferencesTable(getDescription(Bpmn2ViewsRepository.CallActivity.Properties.resources, Bpmn2Messages.CallActivityPropertiesEditionPart_ResourcesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				resources.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				resources.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				resources.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				resources.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.resourcesFilters) {
			this.resources.addFilter(filter);
		}
		this.resources.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallActivity.Properties.resources, Bpmn2ViewsRepository.FORM_KIND));
		this.resources.createControls(parent, widgetFactory);
		this.resources.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.resources, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData resourcesData = new GridData(GridData.FILL_HORIZONTAL);
		resourcesData.horizontalSpan = 3;
		this.resources.setLayoutData(resourcesData);
		this.resources.setLowerBound(0);
		this.resources.setUpperBound(-1);
		resources.setID(Bpmn2ViewsRepository.CallActivity.Properties.resources);
		resources.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createDefault_FlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, Bpmn2ViewsRepository.CallActivity.Properties.default_, Bpmn2Messages.CallActivityPropertiesEditionPart_Default_Label);
		default_ = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Bpmn2ViewsRepository.CallActivity.Properties.default_, Bpmn2ViewsRepository.FORM_KIND));
		widgetFactory.adapt(default_);
		default_.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData default_Data = new GridData(GridData.FILL_HORIZONTAL);
		default_.setLayoutData(default_Data);
		default_.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.default_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getDefault_()));
			}

		});
		default_.setID(Bpmn2ViewsRepository.CallActivity.Properties.default_);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallActivity.Properties.default_, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createPropertiesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.properties = new ReferencesTable(getDescription(Bpmn2ViewsRepository.CallActivity.Properties.properties_, Bpmn2Messages.CallActivityPropertiesEditionPart_PropertiesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.properties_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				properties.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.properties_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				properties.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.properties_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				properties.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.properties_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				properties.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.propertiesFilters) {
			this.properties.addFilter(filter);
		}
		this.properties.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallActivity.Properties.properties_, Bpmn2ViewsRepository.FORM_KIND));
		this.properties.createControls(parent, widgetFactory);
		this.properties.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.properties_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData propertiesData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesData.horizontalSpan = 3;
		this.properties.setLayoutData(propertiesData);
		this.properties.setLowerBound(0);
		this.properties.setUpperBound(-1);
		properties.setID(Bpmn2ViewsRepository.CallActivity.Properties.properties_);
		properties.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createBoundaryEventRefsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.boundaryEventRefs = new ReferencesTable(getDescription(Bpmn2ViewsRepository.CallActivity.Properties.boundaryEventRefs, Bpmn2Messages.CallActivityPropertiesEditionPart_BoundaryEventRefsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addBoundaryEventRefs(); }
			public void handleEdit(EObject element) { editBoundaryEventRefs(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveBoundaryEventRefs(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromBoundaryEventRefs(element); }
			public void navigateTo(EObject element) { }
		});
		this.boundaryEventRefs.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallActivity.Properties.boundaryEventRefs, Bpmn2ViewsRepository.FORM_KIND));
		this.boundaryEventRefs.createControls(parent, widgetFactory);
		this.boundaryEventRefs.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.boundaryEventRefs, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData boundaryEventRefsData = new GridData(GridData.FILL_HORIZONTAL);
		boundaryEventRefsData.horizontalSpan = 3;
		this.boundaryEventRefs.setLayoutData(boundaryEventRefsData);
		this.boundaryEventRefs.disableMove();
		boundaryEventRefs.setID(Bpmn2ViewsRepository.CallActivity.Properties.boundaryEventRefs);
		boundaryEventRefs.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addBoundaryEventRefs() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(boundaryEventRefs.getInput(), boundaryEventRefsFilters, boundaryEventRefsBusinessFilters,
		"boundaryEventRefs", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.boundaryEventRefs,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				boundaryEventRefs.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveBoundaryEventRefs(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.boundaryEventRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		boundaryEventRefs.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromBoundaryEventRefs(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.boundaryEventRefs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		boundaryEventRefs.refresh();
	}

	/**
	 * 
	 */
	protected void editBoundaryEventRefs(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				boundaryEventRefs.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDataInputAssociationsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.dataInputAssociations = new ReferencesTable(getDescription(Bpmn2ViewsRepository.CallActivity.Properties.dataInputAssociations, Bpmn2Messages.CallActivityPropertiesEditionPart_DataInputAssociationsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.dataInputAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				dataInputAssociations.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.dataInputAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				dataInputAssociations.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.dataInputAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				dataInputAssociations.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.dataInputAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				dataInputAssociations.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.dataInputAssociationsFilters) {
			this.dataInputAssociations.addFilter(filter);
		}
		this.dataInputAssociations.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallActivity.Properties.dataInputAssociations, Bpmn2ViewsRepository.FORM_KIND));
		this.dataInputAssociations.createControls(parent, widgetFactory);
		this.dataInputAssociations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.dataInputAssociations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData dataInputAssociationsData = new GridData(GridData.FILL_HORIZONTAL);
		dataInputAssociationsData.horizontalSpan = 3;
		this.dataInputAssociations.setLayoutData(dataInputAssociationsData);
		this.dataInputAssociations.setLowerBound(0);
		this.dataInputAssociations.setUpperBound(-1);
		dataInputAssociations.setID(Bpmn2ViewsRepository.CallActivity.Properties.dataInputAssociations);
		dataInputAssociations.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDataOutputAssociationsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.dataOutputAssociations = new ReferencesTable(getDescription(Bpmn2ViewsRepository.CallActivity.Properties.dataOutputAssociations, Bpmn2Messages.CallActivityPropertiesEditionPart_DataOutputAssociationsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.dataOutputAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				dataOutputAssociations.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.dataOutputAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				dataOutputAssociations.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.dataOutputAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				dataOutputAssociations.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.dataOutputAssociations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				dataOutputAssociations.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.dataOutputAssociationsFilters) {
			this.dataOutputAssociations.addFilter(filter);
		}
		this.dataOutputAssociations.setHelpText(propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallActivity.Properties.dataOutputAssociations, Bpmn2ViewsRepository.FORM_KIND));
		this.dataOutputAssociations.createControls(parent, widgetFactory);
		this.dataOutputAssociations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.dataOutputAssociations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData dataOutputAssociationsData = new GridData(GridData.FILL_HORIZONTAL);
		dataOutputAssociationsData.horizontalSpan = 3;
		this.dataOutputAssociations.setLayoutData(dataOutputAssociationsData);
		this.dataOutputAssociations.setLowerBound(0);
		this.dataOutputAssociations.setUpperBound(-1);
		dataOutputAssociations.setID(Bpmn2ViewsRepository.CallActivity.Properties.dataOutputAssociations);
		dataOutputAssociations.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createStartQuantityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.CallActivity.Properties.startQuantity, Bpmn2Messages.CallActivityPropertiesEditionPart_StartQuantityLabel);
		startQuantity = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		startQuantity.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData startQuantityData = new GridData(GridData.FILL_HORIZONTAL);
		startQuantity.setLayoutData(startQuantityData);
		startQuantity.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							CallActivityPropertiesEditionPartForm.this,
							Bpmn2ViewsRepository.CallActivity.Properties.startQuantity,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, startQuantity.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CallActivityPropertiesEditionPartForm.this,
									Bpmn2ViewsRepository.CallActivity.Properties.startQuantity,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, startQuantity.getText()));
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
									CallActivityPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		startQuantity.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.startQuantity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, startQuantity.getText()));
				}
			}
		});
		EditingUtils.setID(startQuantity, Bpmn2ViewsRepository.CallActivity.Properties.startQuantity);
		EditingUtils.setEEFtype(startQuantity, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallActivity.Properties.startQuantity, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCompletionQuantityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, Bpmn2ViewsRepository.CallActivity.Properties.completionQuantity, Bpmn2Messages.CallActivityPropertiesEditionPart_CompletionQuantityLabel);
		completionQuantity = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		completionQuantity.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData completionQuantityData = new GridData(GridData.FILL_HORIZONTAL);
		completionQuantity.setLayoutData(completionQuantityData);
		completionQuantity.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							CallActivityPropertiesEditionPartForm.this,
							Bpmn2ViewsRepository.CallActivity.Properties.completionQuantity,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, completionQuantity.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CallActivityPropertiesEditionPartForm.this,
									Bpmn2ViewsRepository.CallActivity.Properties.completionQuantity,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, completionQuantity.getText()));
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
									CallActivityPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		completionQuantity.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.completionQuantity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, completionQuantity.getText()));
				}
			}
		});
		EditingUtils.setID(completionQuantity, Bpmn2ViewsRepository.CallActivity.Properties.completionQuantity);
		EditingUtils.setEEFtype(completionQuantity, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallActivity.Properties.completionQuantity, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createCalledElementRefFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, Bpmn2ViewsRepository.CallActivity.Properties.calledElementRef, Bpmn2Messages.CallActivityPropertiesEditionPart_CalledElementRefLabel);
		calledElementRef = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(Bpmn2ViewsRepository.CallActivity.Properties.calledElementRef, Bpmn2ViewsRepository.FORM_KIND));
		widgetFactory.adapt(calledElementRef);
		calledElementRef.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData calledElementRefData = new GridData(GridData.FILL_HORIZONTAL);
		calledElementRef.setLayoutData(calledElementRefData);
		calledElementRef.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CallActivityPropertiesEditionPartForm.this, Bpmn2ViewsRepository.CallActivity.Properties.calledElementRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getCalledElementRef()));
			}

		});
		calledElementRef.setID(Bpmn2ViewsRepository.CallActivity.Properties.calledElementRef);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(Bpmn2ViewsRepository.CallActivity.Properties.calledElementRef, Bpmn2ViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#setId(String newValue)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#initExtensionDefinitions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#updateExtensionDefinitions()
	 * 
	 */
	public void updateExtensionDefinitions() {
	extensionDefinitions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addBusinessFilterExtensionDefinitions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionDefinitions(ViewerFilter filter) {
		extensionDefinitionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#isContainedInExtensionDefinitionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionDefinitionsTable(EObject element) {
		return ((ReferencesTableSettings)extensionDefinitions.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#initExtensionValues(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#updateExtensionValues()
	 * 
	 */
	public void updateExtensionValues() {
	extensionValues.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addFilterExtensionValues(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addBusinessFilterExtensionValues(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExtensionValues(ViewerFilter filter) {
		extensionValuesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#isContainedInExtensionValuesTable(EObject element)
	 * 
	 */
	public boolean isContainedInExtensionValuesTable(EObject element) {
		return ((ReferencesTableSettings)extensionValues.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#initDocumentation(EObject current, EReference containingFeature, EReference feature)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#updateDocumentation()
	 * 
	 */
	public void updateDocumentation() {
	documentation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addFilterDocumentation(ViewerFilter filter)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addBusinessFilterDocumentation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDocumentation(ViewerFilter filter) {
		documentationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#isContainedInDocumentationTable(EObject element)
	 * 
	 */
	public boolean isContainedInDocumentationTable(EObject element) {
		return ((ReferencesTableSettings)documentation.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#setName(String newValue)
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
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#initCategoryValueRef(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initCategoryValueRef(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		categoryValueRef.setContentProvider(contentProvider);
		categoryValueRef.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#updateCategoryValueRef()
	 * 
	 */
	public void updateCategoryValueRef() {
	categoryValueRef.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addFilterCategoryValueRef(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCategoryValueRef(ViewerFilter filter) {
		categoryValueRefFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addBusinessFilterCategoryValueRef(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCategoryValueRef(ViewerFilter filter) {
		categoryValueRefBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#isContainedInCategoryValueRefTable(EObject element)
	 * 
	 */
	public boolean isContainedInCategoryValueRefTable(EObject element) {
		return ((ReferencesTableSettings)categoryValueRef.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#initOutgoing(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOutgoing(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outgoing.setContentProvider(contentProvider);
		outgoing.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#updateOutgoing()
	 * 
	 */
	public void updateOutgoing() {
	outgoing.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addFilterOutgoing(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutgoing(ViewerFilter filter) {
		outgoingFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addBusinessFilterOutgoing(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutgoing(ViewerFilter filter) {
		outgoingBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#isContainedInOutgoingTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutgoingTable(EObject element) {
		return ((ReferencesTableSettings)outgoing.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#initIncoming(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIncoming(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		incoming.setContentProvider(contentProvider);
		incoming.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#updateIncoming()
	 * 
	 */
	public void updateIncoming() {
	incoming.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addFilterIncoming(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIncoming(ViewerFilter filter) {
		incomingFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addBusinessFilterIncoming(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIncoming(ViewerFilter filter) {
		incomingBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#isContainedInIncomingTable(EObject element)
	 * 
	 */
	public boolean isContainedInIncomingTable(EObject element) {
		return ((ReferencesTableSettings)incoming.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#getIsForCompensation()
	 * 
	 */
	public Boolean getIsForCompensation() {
		return Boolean.valueOf(isForCompensation.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#setIsForCompensation(Boolean newValue)
	 * 
	 */
	public void setIsForCompensation(Boolean newValue) {
		if (newValue != null) {
			isForCompensation.setSelection(newValue.booleanValue());
		} else {
			isForCompensation.setSelection(false);
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#initResources(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initResources(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		resources.setContentProvider(contentProvider);
		resources.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#updateResources()
	 * 
	 */
	public void updateResources() {
	resources.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addFilterResources(ViewerFilter filter)
	 * 
	 */
	public void addFilterToResources(ViewerFilter filter) {
		resourcesFilters.add(filter);
		if (this.resources != null) {
			this.resources.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addBusinessFilterResources(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResources(ViewerFilter filter) {
		resourcesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#isContainedInResourcesTable(EObject element)
	 * 
	 */
	public boolean isContainedInResourcesTable(EObject element) {
		return ((ReferencesTableSettings)resources.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#getDefault_()
	 * 
	 */
	public EObject getDefault_() {
		if (default_.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) default_.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#initDefault_(EObjectFlatComboSettings)
	 */
	public void initDefault_(EObjectFlatComboSettings settings) {
		default_.setInput(settings);
		if (current != null) {
			default_.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#setDefault_(EObject newValue)
	 * 
	 */
	public void setDefault_(EObject newValue) {
		if (newValue != null) {
			default_.setSelection(new StructuredSelection(newValue));
		} else {
			default_.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#setDefault_ButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDefault_ButtonMode(ButtonsModeEnum newValue) {
		default_.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addFilterDefault_(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDefault_(ViewerFilter filter) {
		default_.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addBusinessFilterDefault_(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDefault_(ViewerFilter filter) {
		default_.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#initProperties(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initProperties(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		properties.setContentProvider(contentProvider);
		properties.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#updateProperties()
	 * 
	 */
	public void updateProperties() {
	properties.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addFilterProperties(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProperties(ViewerFilter filter) {
		propertiesFilters.add(filter);
		if (this.properties != null) {
			this.properties.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addBusinessFilterProperties(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProperties(ViewerFilter filter) {
		propertiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#isContainedInPropertiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInPropertiesTable(EObject element) {
		return ((ReferencesTableSettings)properties.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#initBoundaryEventRefs(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initBoundaryEventRefs(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		boundaryEventRefs.setContentProvider(contentProvider);
		boundaryEventRefs.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#updateBoundaryEventRefs()
	 * 
	 */
	public void updateBoundaryEventRefs() {
	boundaryEventRefs.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addFilterBoundaryEventRefs(ViewerFilter filter)
	 * 
	 */
	public void addFilterToBoundaryEventRefs(ViewerFilter filter) {
		boundaryEventRefsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addBusinessFilterBoundaryEventRefs(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToBoundaryEventRefs(ViewerFilter filter) {
		boundaryEventRefsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#isContainedInBoundaryEventRefsTable(EObject element)
	 * 
	 */
	public boolean isContainedInBoundaryEventRefsTable(EObject element) {
		return ((ReferencesTableSettings)boundaryEventRefs.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#initDataInputAssociations(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initDataInputAssociations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		dataInputAssociations.setContentProvider(contentProvider);
		dataInputAssociations.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#updateDataInputAssociations()
	 * 
	 */
	public void updateDataInputAssociations() {
	dataInputAssociations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addFilterDataInputAssociations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDataInputAssociations(ViewerFilter filter) {
		dataInputAssociationsFilters.add(filter);
		if (this.dataInputAssociations != null) {
			this.dataInputAssociations.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addBusinessFilterDataInputAssociations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDataInputAssociations(ViewerFilter filter) {
		dataInputAssociationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#isContainedInDataInputAssociationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInDataInputAssociationsTable(EObject element) {
		return ((ReferencesTableSettings)dataInputAssociations.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#initDataOutputAssociations(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initDataOutputAssociations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		dataOutputAssociations.setContentProvider(contentProvider);
		dataOutputAssociations.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#updateDataOutputAssociations()
	 * 
	 */
	public void updateDataOutputAssociations() {
	dataOutputAssociations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addFilterDataOutputAssociations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDataOutputAssociations(ViewerFilter filter) {
		dataOutputAssociationsFilters.add(filter);
		if (this.dataOutputAssociations != null) {
			this.dataOutputAssociations.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addBusinessFilterDataOutputAssociations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDataOutputAssociations(ViewerFilter filter) {
		dataOutputAssociationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#isContainedInDataOutputAssociationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInDataOutputAssociationsTable(EObject element) {
		return ((ReferencesTableSettings)dataOutputAssociations.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#getStartQuantity()
	 * 
	 */
	public String getStartQuantity() {
		return startQuantity.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#setStartQuantity(String newValue)
	 * 
	 */
	public void setStartQuantity(String newValue) {
		if (newValue != null) {
			startQuantity.setText(newValue);
		} else {
			startQuantity.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#getCompletionQuantity()
	 * 
	 */
	public String getCompletionQuantity() {
		return completionQuantity.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#setCompletionQuantity(String newValue)
	 * 
	 */
	public void setCompletionQuantity(String newValue) {
		if (newValue != null) {
			completionQuantity.setText(newValue);
		} else {
			completionQuantity.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#getCalledElementRef()
	 * 
	 */
	public EObject getCalledElementRef() {
		if (calledElementRef.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) calledElementRef.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#initCalledElementRef(EObjectFlatComboSettings)
	 */
	public void initCalledElementRef(EObjectFlatComboSettings settings) {
		calledElementRef.setInput(settings);
		if (current != null) {
			calledElementRef.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#setCalledElementRef(EObject newValue)
	 * 
	 */
	public void setCalledElementRef(EObject newValue) {
		if (newValue != null) {
			calledElementRef.setSelection(new StructuredSelection(newValue));
		} else {
			calledElementRef.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#setCalledElementRefButtonMode(ButtonsModeEnum newValue)
	 */
	public void setCalledElementRefButtonMode(ButtonsModeEnum newValue) {
		calledElementRef.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addFilterCalledElementRef(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCalledElementRef(ViewerFilter filter) {
		calledElementRef.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.bpmn2.parts.CallActivityPropertiesEditionPart#addBusinessFilterCalledElementRef(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCalledElementRef(ViewerFilter filter) {
		calledElementRef.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return Bpmn2Messages.CallActivity_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
